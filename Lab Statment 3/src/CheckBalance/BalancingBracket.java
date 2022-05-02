package CheckBalance;

import java.util.*;

public class BalancingBracket {

	// creating stack to store opening brackets
	Stack<Character> Stk = new Stack<Character>();

	// program to check if string is balanced
	public Boolean checkBalanced(String str) {

		for (int i = 0; i < str.length(); i++) {

			// storing every character of string int temp to process from first string
			// character to last string character
			Character temp = str.charAt(i);

			/*
			 * if string contains any opening brackets i.e. { , [ , ( then, these brackets
			 * will be pushed into the stack stk
			 */

			if (temp == '(' || temp == '[' || temp == '{') {

				// Push the element in the stack
				Stk.push(temp);

				continue; // Breaking the current loop if condition satisfied
			}

			/*
			 * if string contain any closing brackets i.e. } , ] , ) then, the last element
			 * of stack is pop into temporary characer variable 'temp'
			 */

			if (Stk.isEmpty())
				return false;

			if (temp == ')') {

				Character temp1 = Stk.pop();

				// if poped element i.e. temp1 does not contains (
				// then it is unbalanced string
				// in this case loop will be break without popping element
				// due to which stack will not empty
				// hence , string will be unbalanced

				if (temp1 == '{' || temp1 == '[') {
					break;
				}
			}

			else if (temp == '}') {
				Character temp1 = Stk.pop();

				// if popped element i.e. temp1 does not contains {
				// then it is unbalanced string
				// in this case loop will be break without popping element
				// due to which stack will not empty
				// hence , string will be unbalanced

				if (temp1 == '(' || temp1 == '[') {
					break;
				}
			}

			else if (temp == ']') {
				Character temp1 = Stk.pop();

				// if popped element i.e. temp1 does not contains [
				// then it is unbalanced string
				// in this case loop will be break without popping element
				// due to which stack will not empty
				// hence , string will be unbalanced

				if (temp1 == '{' || temp1 == '(') {
					break;
				}
			} else
				continue;

		}

		return (Stk.isEmpty());
	}
}

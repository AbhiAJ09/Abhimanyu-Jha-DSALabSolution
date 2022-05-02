package CheckBalance;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] arg) {
		String str;
		Scanner AJ = new Scanner(System.in);

		System.out.println("Enter the strings with Brackets");
		str = AJ.nextLine();

		BalancingBracket obj = new BalancingBracket();

		if (obj.checkBalanced(str) == true) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}
}

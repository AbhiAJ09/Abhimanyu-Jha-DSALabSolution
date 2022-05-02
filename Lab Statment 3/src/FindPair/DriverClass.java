package FindPair;

import FindPair.Find_sumPair_BST.Node;

public class DriverClass {

	public static void main(String[] arg) {
		{
			Find_sumPair_BST obj = new Find_sumPair_BST();
			Node root = null;
			root = obj.insertNode(root, 35);
			root = obj.insertNode(root, 46);
			root = obj.insertNode(root, 16);
			root = obj.insertNode(root, 498);
			root = obj.insertNode(root, 60);
			root = obj.insertNode(root, 16);
			root = obj.insertNode(root, 16);
			root = obj.insertNode(root, 70);

			int sum = 130;
			obj.findPair(root, sum);
		}
	}

}

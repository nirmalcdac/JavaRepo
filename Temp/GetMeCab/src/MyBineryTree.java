public class MyBineryTree {
	TreeNode root;

	public MyBineryTree() {
		root = null;
	}

	public MyBineryTree(TreeNode root) {
		this.root = root;
	}

	public void visit(TreeNode p) {
		System.out.print(p.employeeID + " ");
	}

	public void traverseTree(TreeNode root, int totalBonus) {
		if (root == null) {
			return;
		}
		int remainingBonus = 0;
		// visit(root);
		traverseTree(root.left, remainingBonus);
		traverseTree(root.right, remainingBonus);

	}
}

public class TreeNode {
	String employeeID;
	String employeeName;
	String managerID;
	int score;
	TreeNode left;
	TreeNode right;

	public TreeNode(String stringInput) {
		String[] temp = stringInput.split(",");
		this.employeeID = temp[0];
		this.employeeName = temp[0];
		this.managerID = temp[0];
		this.score = Integer.parseInt(temp[0]);
		left = right = null;
	}
}

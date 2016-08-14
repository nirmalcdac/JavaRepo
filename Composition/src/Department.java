class Department {
	private int Deptid;
	private String DeptName;

	public Department(int dept, String deptN) {
		Deptid = dept;
		DeptName = deptN;
	}

	public Department() {
		Deptid = 200;
		DeptName = "Management";
	}

	public int getDeptid() {
		return Deptid;
	}

	public void setDeptid(int deptid) {
		Deptid = deptid;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
}
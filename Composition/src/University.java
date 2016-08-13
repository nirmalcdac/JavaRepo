import java.util.ArrayList;
class University
{
	private String uName;
	private ArrayList<Department> deptList=new ArrayList<Department>();
	public University(String name,int deptId,String deptName)
	{
		uName=name;
		Department dept1=new Department(deptId,deptName);
		deptList.add(dept1);
	}
	public String getuName() 
	{
		return uName;
	}
	public void setuName(String uName) 
	{
		this.uName = uName;
	}
	public void addDepartment(int deptId,String deptName)
	{
		deptList.add(new Department(deptId,deptName));
	}
	public void showList()
	{
		if(deptList.size()==0)
		{
			System.out.println("Sorry list is empty");
		}
		else
		{
			for(Department dept:deptList)
			{
				System.out.println("Department Id is: "+dept.getDeptid()+" Department name is: "+dept.getDeptName());
			}
		}
	}
}
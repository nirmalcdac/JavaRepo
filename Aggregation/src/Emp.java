public class Emp 
{
	int id;
	String name;
	Address address;
	Mobile mobile;
	public Emp(int id, String name,Address address,Mobile mobile)
	{
		this.id = id;
		this.name = name;
		this.address=address;
		this.mobile=mobile;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		System.out.println(mobile.cell1+" "+mobile.cell2);
	}
	public static void main(String[] args)
	{
		Address address1=new Address("JAIPUR","RAJASTHAN","INDIA");
		Address address2=new Address("JAIPUR","RAJASTHAN","INDIA");
		Mobile mobile1=new Mobile("7875046500","7875046500");
		Mobile mobile2=new Mobile("7875046500","7875046500");
		Emp e=new Emp(111,"NIRMAL",address1,mobile1);
		Emp e2=new Emp(112,"KUMAR",address2,mobile2);	
		e.display();
		e2.display();
	}
}
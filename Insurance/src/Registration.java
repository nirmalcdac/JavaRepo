
public class Registration {
	private String regNumber;
	public SalesDepartment sales_dept;
	private Customer customerDetails;
	private Payment payment;
	private Vehicle vehicleDetails;
	public RTODepartment rtodepartment;
	private Employee employeeDetails;

	public Registration(Customer customer, Vehicle vehicle, SalesRepresentative salesRepresentative,
			RTODepartment rtodepartment) {
		// TODO Auto-generated constructor stub
		this.regNumber = "thiqr3461hdn";
		this.customerDetails = customer;
		this.vehicleDetails = vehicle;
		this.employeeDetails = salesRepresentative;
		this.rtodepartment = rtodepartment;

	}

	public Registration(String regNo) {
		// TODO Auto-generated constructor stub
		this.regNumber = regNo;
	}

	public String getregistrationNo() {
		// TODO Auto-generated method stub
		return this.regNumber;
	}

	public void setpaymentDetails(Payment payment) {
		this.payment = payment;
	}

	public void diplayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Registion Number:" + this.getregistrationNo());
		System.out.println("Vehicle Model:" + this.vehicleDetails.getModel());
		System.out.println("Vehicle Type:" + this.vehicleDetails.getType());
		System.out.println("vehicle Registered place:" + this.getRegistrationPlace());
		System.out.println("Customer Details");
		System.out.println("customer Name" + this.customerDetails.getName());
		System.out.println("contact Number" + this.customerDetails.getContactinfo());

	}

	private String getRegistrationPlace() {
		// TODO Auto-generated method stub
		return rtodepartment.getPlace();
	}

}

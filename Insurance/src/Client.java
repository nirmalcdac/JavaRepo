import java.util.Date;

public class Client {
	public static void main(String[] args) {
		Dealer dealer = new Dealer("M & M");
		SalesRepresentative salesRep = new SalesRepresentative("mmmmmm", new Date(11 - 9 - 1990),
				new Date(11 - 9 - 1990), dealer);
		Vehicle vehicle = new Vehicle(4, "123d123", "BLUE", "utility", "DIESEL", "maruti");
		InsuranceCompany insurancecompany = new InsuranceCompany();
		RTODepartment rtodepartment = new RTODepartment("panaji");
		dealer.addEmployee(salesRep);
		dealer.addVehicle(vehicle);
		Customer customer = new Customer("Macroy", "GOA UNIVERSITY", new Date(11 - 9 - 1990), 904534, salesRep);
		salesRep.registervehicle(customer, vehicle, rtodepartment);
		salesRep.insurevehicle(customer, vehicle, insurancecompany);
		salesRep.renewInsurance(customer);
	}

}
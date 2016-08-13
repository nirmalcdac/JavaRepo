import java.util.ArrayList;
import java.util.List;



/** */
public class SalesDepartment
{
	 private List<Vehicle> vehicleList=new ArrayList<Vehicle>();

	public void setRegisterDetails(Vehicle vehicle) {
		System.out.println("vehicle registered with sales Department");
		this.vehicleList.add(vehicle);
	}
}

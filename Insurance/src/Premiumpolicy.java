import java.util.Calendar;
import java.util.Date;

public class Premiumpolicy implements Policytype {

	private String policyNumber;
	private String policyDescription;
	private int policyAmount;
	private Date issuedOn;
	private Date dueDate;

	public Premiumpolicy() {
		this.policyNumber = "prem12";
		this.policyDescription = "one year premium policy";
		this.policyAmount = 75784;
		this.issuedOn = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.YEAR, 1);
		this.dueDate = calendar.getTime();
	}

	public String getDuedate() {
		// TODO Auto-generated method stub
		return this.dueDate.toString();
	}

	public String getIssueddate() {
		// TODO Auto-generated method stub
		return this.issuedOn.toString();
	}

	public String getPolicynumber() {
		// TODO Auto-generated method stub
		return this.policyNumber;
	}

	public String getPolicydescription() {
		// TODO Auto-generated method stub
		return this.policyDescription;
	}

}

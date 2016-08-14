import java.util.Date;

public class Policy {
	public Policy(Policytype policytype) {
		// TODO Auto-generated constructor stub
		this.policytype = policytype;
	}

	/*	
	*/
	private Policytype policytype;

	public String getIssueddate() {
		// TODO Auto-generated method stub
		return this.policytype.getIssueddate();

	}

	public String getDuedate() {
		// TODO Auto-generated method stub
		return this.policytype.getDuedate();
	}

	public String getPolicydescription() {
		// TODO Auto-generated method stub
		return this.policytype.getPolicydescription();
	}

}

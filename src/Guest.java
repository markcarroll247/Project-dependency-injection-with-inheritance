
public class Guest extends BasicEmployee {
	
	protected String company;
	protected String contact;
 
	//constructor
	public Guest(String firstName, String lastName, String emailAddress, String mobileNumber, IMessage msg, String company, String contact) {
		super(firstName, lastName, emailAddress, mobileNumber, msg);
		this.company = company;
		this.contact = contact;
	}

	
	
	//getters and setters here downwards
	protected String getCompany() {
		return company;
	}


	protected void setCompany(String company) {
		this.company = company;
	}


	protected String getContact() {
		return contact;
	}


	protected void setContact(String contact) {
		this.contact = contact;
	}

	
}

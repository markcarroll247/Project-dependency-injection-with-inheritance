
public class Contractor extends Guest {
	
	protected String dateOfBirth;

	//constructor
	public Contractor(String firstName, String lastName, String emailAddress, String mobileNumber, IMessage msg, String company, String contact, String dateOfBirth) {
		super(firstName, lastName, emailAddress, mobileNumber, msg, company, contact);
		this.dateOfBirth = dateOfBirth;
	}
	

	//getters and setters here downwards
	protected String getDateOfBirth() {
		return dateOfBirth;
	}


	protected void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}





	
	


}

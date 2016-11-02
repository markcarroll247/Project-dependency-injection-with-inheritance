
public class GeneralEmployee extends BasicEmployee{
	
	protected String dateOfBirth;
	protected int salary;
	protected String jobTitle;

	
	//constructor
	public GeneralEmployee(String firstName, String lastName, String emailAddress, String mobileNumber, IMessage msg, String dateOfBirth, int salary, String jobTitle) {
		super(firstName, lastName, emailAddress, mobileNumber, msg);
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
		this.jobTitle = jobTitle;
		
	}
	
	
	
	//getters and setters here downwards
	protected String getDateOfBirth() {
		return dateOfBirth;
	}

	protected void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	protected int getSalary() {
		return salary;
	}

	protected void setSalary(int salary) {
		this.salary = salary;
	}

	protected String getJobTitle() {
		return jobTitle;
	}

	protected void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	

}

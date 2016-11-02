
public class BasicEmployee {
	//this is the base class which all employees inherit from
	//LSP in the base class
	
	
	protected IMessage msg= null; 
	
	protected String firstName;
	protected String lastName;
	protected String emailAddress;
	protected String mobileNumber;
	
	
	//constructor
	public BasicEmployee(String firstName, String lastName, String emailAddress, String mobileNumber, IMessage msg){  //constructor
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
		this.msg = msg;
	}
	
	
	//included this here so all employees will be able to call it
	protected void sendMessage(String msg_from, String msg_to, String message) {  
		msg.sendMessage(msg_from, msg_to, message);	
	}
	
	
	//getters and setters here downwards
	protected IMessage getMsg() {
		return msg;
	}



	protected void setMsg(IMessage msg) {
		this.msg = msg;
	}



	protected String getFirstName() {
		return firstName;
	}



	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	protected String getLastName() {
		return lastName;
	}



	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}



	protected String getEmailAddress() {
		return emailAddress;
	}



	protected void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	protected String getMobileNumber() {
		return mobileNumber;
	}



	protected void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


}

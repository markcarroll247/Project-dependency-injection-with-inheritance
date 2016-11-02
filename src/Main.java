
public class Main {

	public static void main(String[] args) {
		
		IMessage email = new EmailService();  // Dependency inversion principle
		//IMessage sms = new SMSService(); // may be needed in the future
		
		IMessage messagingService = email; //if changing to sms, replace email with sms
		
		Event e1 = new Event(); //Instantiates the Event class, can now add the employees to the list in this class
		
		
		Guest g1 = new Guest("Liam", "Carroll", "liam@gmail.com", "0871234567", messagingService, "company", "contact");
		Guest g2 = new Guest("John", "Farrell", "john@gmail.com", "0871111111", messagingService, "company", "contact");
		Guest g3 = new Guest("William", "Dooley", "william@gmail.com", "0872222222", messagingService, "company", "contact");
		Guest g4 = new Guest("Agnes", "Dooley", "agnes@gmail.com", "0873333333", messagingService, "company", "contact");
		
		Contractor c1 = new Contractor("Crona", "McMonagle", "crona@gmail.com", "0877654321", messagingService, "company", "contact", "December 1990");
		Contractor c2 = new Contractor("Aoife", "McMonagle", "aoife@gmail.com", "0874444444", messagingService, "company", "contact", "March 1988");
		Contractor c3 = new Contractor("Eoghan", "McMonagle", "eoghan@gmail.com", "0875555555", messagingService, "company", "contact", "May 1982");
		Contractor c4 = new Contractor("Trixie", "McMonagle", "Trixie@gmail.com", "0876666666", messagingService, "company", "contact", "October 1985");

		GeneralEmployee ge1 = new GeneralEmployee("Louis", "Page", "louis@gmail.com", "0877777777", messagingService, "June 1988", 60000, "Software Engineer");
		GeneralEmployee ge2 = new GeneralEmployee("Veronica", "Page", "veronica@gmail.com", "0878888888", messagingService, "March 1983", 40000, "Teacher");
		GeneralEmployee ge3 = new GeneralEmployee("Anthony", "Toohey", "anthony@gmail.com", "0879999999", messagingService, "November 1980", 50000, "Accountant");
		GeneralEmployee ge4 = new GeneralEmployee("Mary", "Toohey", "mary@gmail.com", "0871212121", messagingService, "May 1975", 40000, "Chef");


		//adding attendee objects to the event list
		e1.addAttendeeToEventList(g1);
		e1.addAttendeeToEventList(g2);
		e1.addAttendeeToEventList(g3);
		e1.addAttendeeToEventList(g4);
		e1.addAttendeeToEventList(c1);
		e1.addAttendeeToEventList(c2);
		e1.addAttendeeToEventList(c3);
		e1.addAttendeeToEventList(c4);
		e1.addAttendeeToEventList(ge1);
		e1.addAttendeeToEventList(ge2);
		e1.addAttendeeToEventList(ge3);
		e1.addAttendeeToEventList(ge4);
		
		
		e1.eventOverMessage(); //to be called when the event is over, sends out a thank you message
	
	}

}

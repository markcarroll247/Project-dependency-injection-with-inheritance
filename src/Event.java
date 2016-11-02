import java.util.ArrayList;

public class Event {
	
	//creating an ArrayList, all attendees will be saved to this list
	ArrayList<BasicEmployee> listOfAttendees= new ArrayList<BasicEmployee>(); 
	
	
	
	public void addAttendeeToEventList(BasicEmployee attendee){ //accepts attendee as a parameter e.g. g1, c1, ge1 etc
		listOfAttendees.add(attendee); // adds attendee to the list
		attendee.sendMessage("company@gmail.com", attendee.getEmailAddress(), "Welcome to the event."); //when the attendee is added they will get the welcome message immediately
	}
	
	
	
	// cycles through the list of attendees when the event is over, gets their email address and sends them a thank you message
	public void eventOverMessage(){
		for(int i = 0; i <= listOfAttendees.size()-1; i++){ 
			listOfAttendees.get(i).sendMessage("company@gmail.com", listOfAttendees.get(i).getEmailAddress(), "Thanks for attending today's event.");
		}
	}

}

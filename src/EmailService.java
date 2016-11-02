
public class EmailService implements IMessage {

	
	public void sendMessage(String msg_from, String msg_to, String message) {
		System.out.println("Sending email");
		System.out.println(msg_to);
		System.out.println(message);  // could take this out after
	}
	
}
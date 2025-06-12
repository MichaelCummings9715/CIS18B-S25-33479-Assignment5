package school;

public class SMSObserver implements Observer<SMSNotification> {
	
	@Override
	public void update(SMSNotification notification) {
		System.out.println("Sending SMS. Recipient: " + notification.getPhoneNumber());
	}
	
}

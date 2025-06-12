package school;

public class EmailObserver implements Observer<EmailNotification> {
	
	@Override
	public void update(EmailNotification notification) {
		System.out.println("Sending Email. Recipient: " + notification.getRecipient());
		
		if (notification.getCc() != null) {
            System.out.println("CC: " + notification.getCc());
        }
        if (notification.getBcc() != null) {
            System.out.println("BCC: " + notification.getBcc());
        }
        
	}

}

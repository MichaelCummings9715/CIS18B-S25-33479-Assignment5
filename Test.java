package school;

public class Test {

	public static void main(String[] args) {
		
		// create main service. 
		NotificationService notificationService = new NotificationService();
		
		// create factory 
		EmailNotificationFactory emailFactory = new EmailNotificationFactory();
		SMSNotificationFactory smsFactory = new SMSNotificationFactory();
		
		// create observers
		EmailObserver emailObserver = new EmailObserver();
		SMSObserver smsObserver = new SMSObserver();
		// Add observers
		notificationService.addObserver(emailObserver);
		notificationService.addObserver(smsObserver);
		
		// create update email
		EmailNotification simpleEmail = emailFactory.newNotification("subscriber@things.com", "Stock Update!", "Krakens have been restocked!");
		notificationService.sendNotification(simpleEmail);
		
		// Create sms update
		Notification<?> sms = smsFactory.newNotification("555-555-5555", "Black friday sale now!");
		notificationService.sendNotification(sms);
		
		// Builder email
		Notification<?> complexEmail = new EmailNotification.Builder("subscriber@things.com", "Important: New sale!", "Come in for a sale plus give away for the first 30 customrers").withCc("thingupdate@shop.com").withBcc("Thingstore@shop.com").build();
		notificationService.sendNotification(complexEmail);
				
		

	}

}

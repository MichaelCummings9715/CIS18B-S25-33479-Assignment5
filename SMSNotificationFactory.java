package school;

public class SMSNotificationFactory implements NotificationFactory<SMSNotification> {

    @Override
    public SMSNotification newNotification(String... parts) {

        if (parts.length != 2) { // 2 parts expected. 
            throw new IllegalArgumentException("SMSNotification requires 2 parts: phoneNumber, message");
        }
        
        String phoneNumber = parts[0];
        String message = parts[1];
        
        return new SMSNotification(phoneNumber, message);
    }
}
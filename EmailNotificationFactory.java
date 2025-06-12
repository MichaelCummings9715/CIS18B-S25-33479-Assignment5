package school;

public class EmailNotificationFactory implements NotificationFactory<EmailNotification> {

    @Override
    public EmailNotification newNotification(String... parts) {
 
        if (parts.length != 3) { // 3 parts expected. 
            throw new IllegalArgumentException("EmailNotification requires 3 parts: recipient, subject, body");
        }
        
        String recipient = parts[0];
        String subject = parts[1];
        String body = parts[2]; 
        
        return new EmailNotification.Builder(recipient, subject, body).build();
    }
} 
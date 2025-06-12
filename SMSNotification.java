package school;

public class SMSNotification extends Notification<String[]>  {
	
	public SMSNotification(String phoneNumber, String message) {
        // [0] = phone number, [1] = message
        super(new String[]{phoneNumber, message});
    }

    public String getPhoneNumber() {
        return getContent()[0];
    }

    public String getMessage() {
        return getContent()[1];
    }

}


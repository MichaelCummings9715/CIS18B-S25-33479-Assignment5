package school;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {


    private final List<Observer<? extends Notification<?>>> observers = new ArrayList<>();

    // Add observer
    public void addObserver(Observer<? extends Notification<?>> observer) {
        observers.add(observer);
    }


    public void sendNotification(Notification<?> notification) {
    	
    	for (Observer<?> observer : observers) {
    		// type erasure
            // We can't check observer because the generic type is erased by the compiler
    		if (observer instanceof EmailObserver && notification instanceof EmailNotification) {
        		EmailObserver emailObserver = (EmailObserver) observer;
        		EmailNotification emailNotification = (EmailNotification) notification;
        		
        		// call update method
        		emailObserver.update(emailNotification);	
        	}
        	
        	if (observer instanceof SMSObserver && notification instanceof SMSNotification) {
        		SMSObserver smsObserver = (SMSObserver) observer;
        		SMSNotification smsNotification = (SMSNotification) notification;
        		
        		smsObserver.update(smsNotification);
        	}
    		
    	}
    	
    }
} 
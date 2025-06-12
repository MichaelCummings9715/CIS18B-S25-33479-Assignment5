package school;

public interface NotificationFactory<T extends Notification<?>> {
	T newNotification(String... parts);
}

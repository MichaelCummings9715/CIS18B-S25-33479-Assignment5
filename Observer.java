package school;

public interface Observer <T extends Notification<?>> {
	
	void update(T notification);
	
	
}
 
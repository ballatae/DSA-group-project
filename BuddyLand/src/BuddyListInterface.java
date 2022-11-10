import java.util.List;
import java.util.Map;

public interface BuddyListInterface {

	
	public void addBuddy(Buddy buddy);
	
	public void addConnection(Buddy buddyA, Buddy buddyB);
	
	public void removeConnection(Buddy buddyA, Buddy buddyB);
	
	public List<Buddy> searchBuddyByName(Buddy buddy, String name);
	
	public int getBuddiesNumber(Buddy buddy);
}

import java.util.*;

public class BuddyList implements BuddyListInterface {
	private static Map<Buddy, List<Buddy>> connections = new HashMap<Buddy, List<Buddy>>();
	
	public BuddyList(){
		super();
	}
	
	public static Map<Buddy, List<Buddy>> getConnections() {
		return connections;
	}

	public void addBuddy(Buddy buddy) {
		if (buddy.getUserName() != null)
			connections.putIfAbsent(buddy, new ArrayList<>());
	}

	public void addConnection(Buddy buddyA, Buddy buddyB) {
		if (connections.containsKey(buddyA) && connections.containsKey(buddyB)) {
			connections.get(buddyB).add(buddyA);
			connections.get(buddyA).add(buddyB);
		}
	}

	public void removeConnection(Buddy buddyA, Buddy buddyB) {
		if (connections.containsKey(buddyA))
			connections.get(buddyA).remove(buddyB);
		if (connections.containsKey(buddyB))
			connections.get(buddyB).remove(buddyA);
	}
	
	
	//don't know what I did maybe you know what we needed to do in this one the others work perfectly
	public List<Buddy> searchBuddyByName(Buddy buddy, String name) {
		List<Buddy> buddyConnections = connections.get(buddy);
		List<Buddy> nameMatches = new ArrayList<>();
		for (Buddy b : buddyConnections) {
			if (name.equals(b.getFirstName()) || name.equals(b.getLastName()))
				nameMatches.add(b);
		}
		return nameMatches;
	}

	public int getBuddiesNumber(Buddy buddy) {
		return connections.get(buddy).size();
	}
}

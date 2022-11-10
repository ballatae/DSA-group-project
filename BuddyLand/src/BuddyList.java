import java.util.*;

public class BuddyList implements BuddyListInterface {
	private static Map<Buddy, List<Buddy>> connections = new HashMap<Buddy, List<Buddy>>();

	public BuddyList() {
		super();
	}

	public static Map<Buddy, List<Buddy>> getConnections() {
		return connections;
	}

	public void addBuddy(Buddy buddy) {
		if (buddy.getUserName() != null)
			connections.putIfAbsent(buddy, new ArrayList<>());
	}

	public void addFriend(Buddy buddyA, Buddy buddyB) {
		if (connections.containsKey(buddyA) && connections.containsKey(buddyB)) {
			connections.get(buddyB).add(buddyA);
			connections.get(buddyA).add(buddyB);
		}
	}

	public void removeFriend(Buddy buddyA, Buddy buddyB) {
		if (connections.containsKey(buddyA))
			connections.get(buddyA).remove(buddyB);
		if (connections.containsKey(buddyB))
			connections.get(buddyB).remove(buddyA);
	}

	// don't know what I did maybe you know what we needed to do in this one the
	// others work perfectly
	public String searchBuddyByName(Buddy buddy, String name) throws Exception{
		List<Buddy> buddyConnections = connections.get(buddy);
		List<Buddy> nameMatches = new ArrayList<>();
		for (Buddy b : buddyConnections) {
			if (name.equals(b.getFirstName()) || name.equals(b.getLastName()))
				nameMatches.add(b);
		}
		if(nameMatches.isEmpty()) {
			throw new NoFriendFound("Sorry we could not find your friend");
		}
		return nameMatches.get(0).weFoundYourBuddyFriend();
		
	}

	public int getBuddiesNumber(Buddy buddy) {
		return connections.get(buddy).size();
	}
}

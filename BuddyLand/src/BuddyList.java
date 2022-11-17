import java.util.*;

public class BuddyList implements BuddyManagmentInterface {
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
		if (!(buddyA == buddyB)) {
			if (connections.containsKey(buddyA) && connections.containsKey(buddyB)) {
				connections.get(buddyB).add(buddyA);
				connections.get(buddyA).add(buddyB);
			}
		} else {
			System.out.println("Can not add yourself as a friend!");
		}
	}

	public void removeFriend(Buddy buddyA, Buddy buddyB) {
		if (!(buddyA == buddyB)) {
			if (connections.containsKey(buddyA))
				connections.get(buddyA).remove(buddyB);
			if (connections.containsKey(buddyB))
				connections.get(buddyB).remove(buddyA);
		} else {
			System.out.println("Can not remove yourself!");
		}
	}

	public String searchBuddyByName(Buddy buddy, String name) throws Exception {
		List<Buddy> buddyConnections = connections.get(buddy);
		List<Buddy> nameMatches = new ArrayList<>();
		for (Buddy b : buddyConnections) {
			if (name.equals(b.getFirstName()) || name.equals(b.getLastName()))
				nameMatches.add(b);
		}
		if (nameMatches.isEmpty()) {
			throw new NoFriendFound("Sorry we could not find your friend");
		}
		return nameMatches.get(0).weFoundYourBuddyFriend();

	}

	public int getBuddiesNumber(Buddy buddy) {
		return connections.get(buddy).size();
	}

}
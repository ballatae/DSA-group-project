
public interface BuddyManagmentInterface {

	public void addBuddy(Buddy buddy);

	public void addFriend(Buddy buddyA, Buddy buddyB);

	public void removeFriend(Buddy buddyA, Buddy buddyB);

	public String searchBuddyByName(Buddy buddy, String name) throws Exception;

	public int getBuddiesNumber(Buddy buddy);
}

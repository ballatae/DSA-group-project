import java.util.ArrayList;

public class BuddyLand {
	private Object accounts[];
	private Buddy buddy;
	private int MAX_SIZE = 2;
	static ArrayList<Buddy> buddyList = new ArrayList <Buddy>(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	BuddyList BuddyList = new BuddyList();
		Buddy buddy1 = new Buddy("user1", "12345", "mike", "wefef", "efwefw@fsdg.com" );
		Buddy buddy2 = new Buddy("user2", "123vf45", "mikve", "wevfef", "evfwefw@fsdg.com" );
		
		buddyList.add(buddy1);
		buddyList.add(buddy2);
//		System.out.println(buddy1);

		
//		for (int i = 0; i <= BuddyList.size(); i++) {
//			System.out.println(BuddyList.get(i));
//		}
		
	}

}

import java.util.ArrayList;

public class BuddyList {
	private int numAccounts;
//	private Object accounts[];
	private Buddy buddy;
	private int MAX_SIZE = 2;
	ArrayList<Buddy> buddyList = new ArrayList <Buddy>(); 

	public BuddyList() {
//		buddyList = new ArrayList <Buddy>(); 
		numAccounts = 0;
	}


	private int translate(int position) {
		return position - 1;
	}

//	public Object get(int index) {
//		return accounts[index];
//
//	}
//
//	private void resize(String allocation) {
//		if (allocation == "expand")
//			MAX_SIZE = MAX_SIZE * 2;
//		else
//			MAX_SIZE = MAX_SIZE / 2;
//
//		Object[] newDataItems = new Object[MAX_SIZE];
//
//		for (int i = 0; i < numAccounts; i++)
//			newDataItems[i] = accounts[i];
//		accounts = newDataItems;
//	}

}

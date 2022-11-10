import java.util.HashMap;

public class BuddyLand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyList application = new BuddyList();

		Buddy etnik = new Buddy("etnik", "ballata", "etnikballata@gmail.com", "kiki", "KiliMili");
		Buddy tringa = new Buddy("tringa", "rexhepaj", "tringarexhepaj@gmail.com", "tringa", "Shylybyli");
		Buddy sotiria = new Buddy("sotiria", "karvounidou", "sotiriakarvounidou@gmail.com", "sotiria", "Shangarepa");
		Buddy elisavet = new Buddy("elisavet", "hassapi", "elisavethassapi@gmail.com", "elisavet", "Domate");

		application.addBuddy(etnik);
		application.addBuddy(tringa);
		application.addBuddy(sotiria);
		application.addBuddy(elisavet);

		application.addFriend(etnik, tringa);
		application.addFriend(etnik, elisavet);

		System.out.println(application.getBuddiesNumber(etnik));

		application.removeFriend(etnik, elisavet);

		System.out.println(application.getBuddiesNumber(tringa));

		try {
			System.out.println(application.searchBuddyByName(etnik, "elisavet"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

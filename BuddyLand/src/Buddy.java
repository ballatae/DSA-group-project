public class Buddy {
	private String firstName, lastName, email, userName, password;

	Buddy(String firstName, String lastName, String email, String userName, String password) {
		try {
			setEmail(email);
			setUserName(userName);
			this.firstName = firstName;
			this.lastName = lastName;
			this.password = password;
		} catch (InvalidEmailExcpetion e) {
			System.out.println("Email is not valid please try again.");
		} catch (UserExistingException e) {
			System.out.println("This user already exists, try another user.");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	private void setEmail(String email) throws InvalidEmailExcpetion {
		if (email.contains("@") && email.contains("."))
			this.email = email;
		else {
			throw new InvalidEmailExcpetion("Not a valid email");
		}
	}

	private void setUserName(String userName) throws UserExistingException {
		for (Buddy buddy : BuddyList.getConnections().keySet()) {
			if (buddy.getUserName().equals(userName)) {
				throw new UserExistingException("Username already used. Choose another one to create a buddy account");
			}
		}
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Buddy [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", userName="
				+ userName + ", password=" + password + "]";
	}

	public String weFoundYourBuddyFriend() {
		return "We found your friend with username: " + userName + "\n" + "email" + email;
	}
}
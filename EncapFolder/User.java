
public class User {
	
	private int userID;
	private String username;
	private String firstname, lastname;
	
	User(int userID, 
			String username, 
			String firstname, 
			String lastname){
		
		this.userID = userID;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		
	}
	
	//able to write variable using setter
	//void setUserID(int userID) {
		//this.userID = userID;
	//}
	
	//for getter
	
	int getUserID() {
		return userID;
	}
	
	String getusername() {
		return username;
	}
	
	void setfirstname (String firstname) {
		this.firstname = firstname;
	}
	
	void setlastname (String lastname) {
		this.lastname = lastname;
	}
	
	String getfirstname() {
		return firstname;
	}
	
	String getlastname() {
		return lastname;
	}
}

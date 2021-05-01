package inheritanceHomework;

public class User {
	
	int id;
	String FirstName;
	String LastName;
	
	public User() {
		
	}

		
	public User (int id, String FirstName, String LastName) {
		
		this.id=id;
		this.FirstName=FirstName;
		this.LastName=LastName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	
	
	
	
}

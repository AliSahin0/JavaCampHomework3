package inheritanceHomework;

public class Instructor extends User {
	
	String  courses;
	
	public Instructor() {
		
	}
	
	public Instructor (int id, String FirstName, String LastName, String  courses) {
		this.courses=courses;
		
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
	
	
	
}

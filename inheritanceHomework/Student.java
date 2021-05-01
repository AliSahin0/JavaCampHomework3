package inheritanceHomework;

public class Student extends User{
	
	String registeredCourses;
	
	public Student () {
		
	}
	
	public Student (int id, String FirstName, String LastName, String registeredCourses) {
		this.registeredCourses=registeredCourses;
		
		
	}

	public String getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(String registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	

}

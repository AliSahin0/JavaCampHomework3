package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
	
	
	Student student =new Student();
	student.setFirstName("Ali");
	student.setLastName("Şahin");
	student.setRegisteredCourses("Java");
	
	Instructor instructor =new Instructor();
	instructor.setFirstName("Engin");
	instructor.setLastName("Demirog");
	instructor.setCourses("C# Eğitimi");
	
	
	StudentManager studentManager =new StudentManager();
	studentManager.addToCourse(student);
	
	InstructorManager instructorManager =new InstructorManager();
	instructorManager.addToCourses(instructor);
	
	
	
	}

}

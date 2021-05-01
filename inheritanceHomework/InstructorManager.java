package inheritanceHomework;

public class InstructorManager extends UserManager{
	
	public void addToCourses (Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" "+instructor.getCourses()+" isimli kursu oluþturdu");
	}
	
	

}

package inheritanceHomework;

public class StudentManager extends UserManager{
	
	public void addToCourse(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" isimli ��renci"+" "+student.getRegisteredCourses() + " kursuna kaydedildi");
		
		
	}

}

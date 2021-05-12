package javacamphomework2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setAge(19);
		student.setFirstName("Eray");
		student.setLastName("Toplar");
		
		Instructor instructor = new Instructor();
		
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setExperienceTime(10);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
		

	}

}
 
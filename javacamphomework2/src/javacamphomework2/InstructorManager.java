package javacamphomework2;

public class InstructorManager extends UserManager {
	
	public void add(User user) {
		System.out.println("Eðitmen Eklendi : "  + user.getFirstName() + " " + user.getLastName()	);
	}

	public void addLesson() {
		System.out.println("Ders Eklendi ");
	}
}

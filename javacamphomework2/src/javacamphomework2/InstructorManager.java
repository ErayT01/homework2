package javacamphomework2;

public class InstructorManager extends UserManager {
	
	public void add(User user) {
		System.out.println("E�itmen Eklendi : "  + user.getFirstName() + " " + user.getLastName()	);
	}

	public void addLesson() {
		System.out.println("Ders Eklendi ");
	}
}

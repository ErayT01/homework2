package javacamphomework2;

public class StudentManager extends UserManager{

	public void add(User user) {
		System.out.println("��renci Eklendi :" + user.getFirstName() + " " + user.lastName + " " + user.id);
	}
	
	public void signIn() {
		System.out.println("Giri� yap�ld� ");
		
	}
	 
}

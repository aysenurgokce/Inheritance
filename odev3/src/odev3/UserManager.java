package odev3;

public class UserManager {

	public void add(StudentManager manager) {
		manager.add();
		manager.message("��renci bilgileri ba�ar�yla eklenmistir!!!!");
		
	}
	public void add2(InstructorManager instructorManager) {
		instructorManager.add();
		instructorManager.message("E�itmen bilgileri ba�ar�yla eklenmistir!!!!");
	}
		
}

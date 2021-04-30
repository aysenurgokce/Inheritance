package odev3;

public class UserManager {

	public void add(StudentManager manager) {
		manager.add();
		manager.message("Öğrenci bilgileri başarıyla eklenmistir!!!!");
		
	}
	public void add2(InstructorManager instructorManager) {
		instructorManager.add();
		instructorManager.message("Eğitmen bilgileri başarıyla eklenmistir!!!!");
	}
		
}

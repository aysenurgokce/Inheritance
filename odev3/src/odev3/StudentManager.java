package odev3;

public class StudentManager extends Student{
	
	public StudentManager(int id, String firstName, String lastName, int password, String email, int not) {
		super(id, firstName, lastName, password, email, not);
	}

	public void add(){
		System.out.println("��renci Bilgileri : " +" �d : "+ getId() + " - Ad� :" + getFirstName() + " - Soyad� : " + getLastName() + " - Mail Adresi : " + getEmail() +" - �ifre : " + getPassword() + " - Not :" + getNot());
}
	public void message(String mesaj) {
		System.out.println(mesaj);
		}
	
}
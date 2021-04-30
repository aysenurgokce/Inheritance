package odev3;

public class InstructorManager extends Instructor {	
	
public InstructorManager(int id, String firstName, String lastName, int password, String email, int number) {
		super(id, firstName, lastName, password, email, number);
	}

public void add(){
	System.out.println("Eðitmen bilgileri : " + " Ýd : "+getId()+ " - Adý : " + getFirstName() + " - Soyadý : " + getLastName() + " - Mail Adresi :" + getEmail() + " - Þifre : " + getPassword() + " - Numarasý :" + getNumber());
		 
}
public void message(String mesaj) {
	System.out.println(mesaj);
	}
}

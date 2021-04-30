package odev3;

public class Instructor extends User{
	
	private int number;
	public Instructor(int id, String firstName, String lastName, int password, String email, int number) {
		super(id, firstName, lastName, password, email);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	

}

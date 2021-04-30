package odev3;

public class Student extends User{
	
      private int not;
	public Student(int id, String firstName, String lastName, int password, String email, int not) {
		super(id, firstName, lastName, password, email);
		this.not = not;
	}

	public int getNot() {
		return not;
	}

	public void setNot(int not) {
		this.not = not;
	}

      
}

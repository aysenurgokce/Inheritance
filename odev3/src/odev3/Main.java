package odev3;

public class Main {

	public static void main(String[] args) {
		
		
		StudentManager studentManager = new StudentManager(1, "Ayşenur", "Gökçe", 12564, "135454@gmail.com", 90);
		
		InstructorManager instructorManager = new InstructorManager(1,"Engin","Demiroğ" ,15454,"54363455@gmail.com",413353);
		
		
		
		
		UserManager manager = new UserManager();
		manager.add(studentManager);
		manager.add2(instructorManager);
		
		
		
	}

}

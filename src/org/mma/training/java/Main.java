package org.mma.training.java;

public class Main {

	public static void main(String[] args) {
		
		
		Student student = new Student();
		
		student.setId(100);
		student.setFirstName("Emran");
		student.setLastName("Hossain");
		student.setMajor("CS");
		student.setYear("Junior");
		
		Student student1 = new Student();
		
		student.setId(101);
		student.setFirstName("Emm");
		student.setLastName("Hoss");
		student.setMajor("CS");
		student.setYear("Senior");
			
		//Creating Student class
		//constructor
		
		Student student3 = new Student(103, "Abu", "R", "Rahmat", "CS", "Junior");
		Student student4 = new Student(104, "Abb", "B", "Rahat", "IT", "Junior");
		Student student5 = new Student(105, "Abby", "K", "Rmat", "IT", "Senior");
		
		System.out.println(student3);
	}

}

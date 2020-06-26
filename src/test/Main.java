package test;

import model.Student;

public class Main {

	public static void main(String[] args) {

		Student jack = new Student("jack", 20, "male", 10086);
		System.out.println("Output by toSting(): " + jack);
		System.out.println("Output by getter method: " 
				+ "name = " + jack.getName() + ", age = " + jack.getAge()
				+ ", gender = " + jack.getGender() + ", id = " + jack.getId());
	}

}

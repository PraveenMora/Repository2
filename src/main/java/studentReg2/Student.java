package studentReg2;

import studentReg2.Course;
import studentReg2.Module;

public class Student {
	
	  // instance variables
	  String name;
	  String age;
	  String dateOfBirth;
	  int ID;
	  String userName;
	  Course[] courses;
	  Module[] modules;

	  public Student(String name, String age) {
		  this.name = name;
		  this.age = age;
	  }

	// getUsername method 
	  public String getUsername(){
	    this.userName = this.name + this.age;
	    return this.userName;
	  }
}


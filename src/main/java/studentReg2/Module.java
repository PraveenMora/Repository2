package studentReg2;

import studentReg2.Course;
import studentReg2.Student;

public class Module {

	  // instance variables
	  String moduleName;
	  Student[] students;
	  Course[] courses;
	  // constructor
	  public Module(String moduleName,Student[] students,Course[] courses){
	    this.moduleName = moduleName;
	    this.students = students;
	    this.courses = courses;
	  }

	  // setters 

	  public void setModuleName(String moduleName){
	    this.moduleName = moduleName;
	  }
	  public void setStudents(Student[] students){
	    this.students = students;
	  }
	  public void setCourses(Course[] courses){
	    this.courses = courses;
	  }

	  // getters 

	  public String getModuleName(){
	    return this.moduleName;
	  }
	  public Student[] getStudents(){
	    return this.students;
	  }
	  public Course[] getCourses(){
	    return this.courses;
	  }

}
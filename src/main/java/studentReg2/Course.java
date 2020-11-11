package studentReg2;

import java.util.Date;

import studentReg2.Module;
import studentReg2.Student;

public class Course {

	String courseName;
	Module[] modules;
	Student[] students;
	Date startDate;
	Date endDate;
	// constructors
	public Course(String courseName, Module[] modules,Student[] students, Date startDate, Date endDate){
	 this.courseName = courseName;
	 this.modules = modules;
	 this.students = students;
	 this.startDate = startDate;
	 this.endDate = endDate;
	}

	// setters 

	public void setCourseName(String courseName){
	 this.courseName = courseName;
	}
	public void setModules(Module[] modules){
	 this.modules = modules;
	}
	public void setStudents(Student[] students){
	 this.students = students;
	}
	public void setStartDate(Date startDate){
	 this.startDate = startDate;
	}
	public void setEndDate(Date endDate){
	 this.endDate = endDate;
	}

	// getters 

	public String getCourseName(){
	 return this.courseName; 
	}
	public Module[] getModules(){
	 return this.modules;
	}
	public Student[] getStudents(){
	 return this.students;
	}
	public Date getStartDate(){
	 return this.startDate;
	}
	public Date getEndDate(){
	 return this.endDate;
	}
}

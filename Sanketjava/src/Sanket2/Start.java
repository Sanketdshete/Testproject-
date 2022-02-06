package Sanket2;

import java.security.Provider.Service;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Start {

	public static void main(String[] args) {

		Studentdetailimplement details = new Studentdetailimplement();
		boolean flag = true ;
	
		System.out.println("student operation");
		while ( flag ) {
			System.out.println(" + "
			+ "1.addStudent\n "
			+ "2.deleteStudent\n "
			+ "3.update\n"
			+ "4.studentAverageCGPA\n"
			+ "5.Student minMark\n"
			+ "6.Student maxMark\n");
	
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter your choise ");
			int choise= sc.nextInt();
		switch(choise)
		{
		
		case 1 :
		// add student
    	
		 System.out.println("TUMHI ADD STUDENT SELECT KELA AAHE ");
		 
		 System.out.println("please add student name ");
		 String studentName = sc.next();
		 
		 System.out.println("Please add the student dept. ");
		 String studentDept = sc.next();
		
		 
		 System.out.println("Please add the student academic year ");
		 int studentyearOfStudy = sc.nextInt();
		 
		 System.out.println("Please enter student cgpa ");
		 float cgpa = sc.nextFloat();
		 
		 System.out.println("Please enter roll number ");
		 int studentRollnumber=sc.nextInt();
		 System.out.println("Student added succesfully");
		 
		 Student student = new Student(studentName, studentRollnumber, studentDept, studentyearOfStudy, cgpa);
		 Student  student1 = details.addStudent(student);
		 System.out.println(student1 );
		 
    	
		 
    
    	break;
		 
    case 2 : // delete student 
    	System.out.println("Want to delete student please enter roll number ");
    	int val = sc.nextInt();
    	Boolean status = details.deleteStudent(val);
    	System.out.println(status);
    	System.out.println("delter student succ");
    	break;
    	
    case 3 : // update student details 
    	System.out.println("update the student detail ");
    	System.out.println("enter student new name  ");    			
		 String updatedname = sc.next();
		 System.out.println("enter student new roll number ");
		 int updatedrollnumber =sc.nextInt();
		 System.out.println("enter student new  dept");
		 String updateddept =sc.next();
		 System.out.println("enter student new academic year ");
		 int updatedyear=sc.nextInt();
		 System.out.println(" enter new cgpa score od this student  ");
		 float updatedccgpa =sc.nextFloat();
		 Student updatedstudent=new Student(updatedname, updatedrollnumber, updateddept, updatedyear, updatedccgpa);
	 updatedstudent= details.update(updatedrollnumber, updatedstudent);
	 System.out.println(updatedstudent);
	 break;
	 
  
    	
	 
		}
}
	}
}


	


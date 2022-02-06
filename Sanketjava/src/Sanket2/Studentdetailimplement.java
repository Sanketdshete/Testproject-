package Sanket2;

import java.util.Arrays;
import java.util.Iterator;

public class Studentdetailimplement implements StudentDetail {


	static Student []  invertarystudents = new Student [0];
	static int indexValue = 0;
	
 	@Override
	public Student addStudent(Student student)  {
     
		if ( student != null )
		{
			invertarystudents = Arrays.copyOf( invertarystudents, invertarystudents.length+1 );
			invertarystudents[indexValue++]=student ;
			System.out.println(" student succesfully added  ");
			return student ;
		}
		System.out.println("invalid student so can not be aadded ");
		return null;
	}

	@Override
	public boolean deleteStudent(int studentrollno) {
		if (invertarystudents.length==0)
		{
			System.out.println("no student to delete ");
			   return false;
		}
		
		   Student []students = new  Student [invertarystudents.length-1];
		   int index =0 ;
			for ( int i=0 ; i< invertarystudents.length;i++ )
				
			{
				Student stu =  invertarystudents[i];
				if ( stu.getstudentRollnumber()== studentrollno)
				{
					continue;
				}
				students [index++]= stu ;
			}
				
			invertarystudents= students ;
			return true ;
		
	}			
				
		
	@Override
	public Student update(int studentrollno, Student newValue) {
		
		for  ( int  i=0 ; i < invertarystudents.length ; i++ )
         {
        	Student stud =  invertarystudents[i];
        	 if ( stud.getstudentRollnumber()== studentrollno) ;
        	 {
        		 stud.setStudentyearOfStudy(newValue.getStudentyearOfStudy());
        		 stud.setStudentDept(newValue.getStudentDept());
        		 stud.setStudentRollnumber(newValue.getstudentRollnumber());
        		 // stud.setStudentSchool(newValue.getStudentSchool());
        		 System.out.println("student  succesfully updated ");
        		 return stud;
        	 }
         }
		return null;
	}

	@Override // Average marks 
	public float studentAverageCGPA() {
		
		
		float sum = 0; // accumulate cgpa of all student 
		for(Student stu : invertarystudents) {
			sum = sum + stu.getCgpa(); // add each students cgpa in sum
		}
		
		// calculate average and return;
		return sum/invertarystudents.length;
	}

	@Override

	public Student minMark() {
		float min = 10;
		Student retStudent = null;
		
		for(Student stu : invertarystudents) {
			if(min > stu.getCgpa())
			{
				min = stu.getCgpa();
				retStudent = stu;
				
			}
		}
		
		
		return retStudent;
	}

	@Override
	public Student maxMark() {
		float max = 0 ;
		Student retStudent = null ;
		for ( Student stu : invertarystudents )
		{
			if ( max < stu.getCgpa())
			{
				max = stu.getCgpa();
				retStudent = stu;
				
			}
		}
		return retStudent ;
	}

}

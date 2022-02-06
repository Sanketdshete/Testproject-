package Sanket2;

public abstract interface StudentDetail {
	
	//add student
	abstract public Student  addStudent(  Student student );
		
	// delete student 
	abstract public  boolean  deleteStudent (int studentrollno );
	
	// update student with newvalue and return updated student 
	abstract public Student update (int studentrollno , Student newValue );
	
	// average CGPA of all student 
	abstract public float studentAverageCGPA();
	
	// return student with minimum mark 
	abstract public Student minMark();
	
	// return student with maximum mark 
	abstract public Student maxMark();


}

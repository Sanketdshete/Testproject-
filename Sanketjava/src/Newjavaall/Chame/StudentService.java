
package Newjavaall.Chame;

 public interface StudentService {
	//Abstraction --> ky services -->
	public Student addStudent(Student stud) throws DuplicateStudent,InvalidStudent;
	public Student updateStudent(int studId,Student stud);
	public boolean deleteStudent(int studId);
	public Student getStudent(int studId);
	public Student[] getAllStudents();

}

//CUSTOM EXCEPTION
class DuplicateStudent extends Exception{
	public DuplicateStudent(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class InvalidStudent extends Exception{

	public InvalidStudent(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}

package Newjavaall.Chame;

import java.util.Arrays;

public class StudentServiceImpl implements StudentService{

	//private Student []students1 = new Student[0];	// instance variable
	private static Student []students = new Student[0];	// static variable
	private static int index = 0;
										//StudentServiceImpl --- ob1 ---------> ob2
															//   students1    students1 --1
															//           students2      --2
	@Override
	public Student addStudent(Student stud) throws DuplicateStudent,InvalidStudent {
		if(stud != null) {
			if(stud.getStudId()<=0 || stud.getStudAge()<6) {
				System.out.println("Invalid Student Values..!");
				throw new InvalidStudent("Invalid Student Values..!");
			}else if(null!=getStudent(stud.getStudId())){
				System.out.println("Duplicate Student Id...!");
				throw new DuplicateStudent("Duplicate Student Id...!");
			}else {
				try 
				{
					
				
				students = Arrays.copyOf(students, students.length+1);
				students[index++] = stud;
				System.out.println("Student Successfully Added...!");
				return stud;
				}
				catch (ArrayIndexOutOfBoundsException e)
				{
					System.out.println(" ArrayIndexOutOfBoundsException");
				}
			}
		}
		System.out.println("Problem in Student Add...!");
		return null;
	}

	@Override
	public Student updateStudent(int studId, Student stud) {
		for (Student student : students) {
			if(student.getStudId() == studId) {
				student.setStudAddress(stud.getStudAddress());
				student.setStudEmail(stud.getStudEmail());
				student.setStudGender(stud.getStudGender());
				student.setStudMarks(stud.getStudMarks());
				student.setStudName(stud.getStudName());
				System.out.println("Student Record Updated...!");
				return student;
			}
		}
		System.out.println("No Student Record with Given Id Found...So Cannot update..");
		return null;
	}

	@Override
	public boolean deleteStudent(int studId) {
		Student []tempArray = new Student[0];
		int index = 0;		//Local --> temporary 
		for (Student student : students) {
			if(student.getStudId() == studId) {
				continue;
			}else {
				tempArray = Arrays.copyOf(tempArray, tempArray.length+1);
				tempArray[index++] = student;
			}
		}
		if(tempArray.length == students.length) {
			return false;
		}else {
			System.out.println("Student Deleted Successfully...");
			students = tempArray;
			return true;
		}
		
	}

	@Override
	public Student getStudent(int studId) {		// student:present  or null:absent
		for (Student student : students) {
			if(student.getStudId() == studId) {
				return student;
			}
		}
		return null;
	}

	@Override
	public Student[] getAllStudents() {
		return students;
	}

}


class InvalidStudentValues extends Exception{
	
}
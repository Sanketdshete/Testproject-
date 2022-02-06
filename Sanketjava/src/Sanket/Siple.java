package Sanket;

public class Siple {

	public static void main(String[] args) {


		class Student 
		{
			private int studentid ;
			private int studentRollNo ;
			private String studentName ;
			/**
			 * @param studentid
			 * @param studentRollNo
			 * @param studentName
			 */
			public Student(int studentid, int studentRollNo, String studentName) {
				super();
				this.studentid = studentid;
				this.studentRollNo = studentRollNo;
				this.studentName = studentName;
				
			}
			@Override
			public String toString() {
				return "Student [studentid=" + studentid + ", studentRollNo=" + studentRollNo + ", studentName="
						+ studentName + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
						+ super.toString() + "]";
				
			}
			/**
			 * @return the studentid
			 */
			public int getStudentid() {
				return studentid;
			}
			/**
			 * @param studentid the studentid to set
			 */
			public void setStudentid(int studentid) {
				this.studentid = studentid;
			}
			/**
			 * @return the studentRollNo
			 */
			public int getStudentRollNo() {
				return studentRollNo;
			}
			/**
			 * @param studentRollNo the studentRollNo to set
			 */
			public void setStudentRollNo(int studentRollNo) {
				this.studentRollNo = studentRollNo;
			}
			/**
			 * @return the studentName
			 */
			public String getStudentName() {
				return studentName;
			}
			/**
			 * @param studentName the studentName to set
			 */
			public void setStudentName(String studentName) {
				this.studentName = studentName;
			}
			
		}

	}

}

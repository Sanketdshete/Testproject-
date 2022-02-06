package Sanket2;


public class Student {

	private String studentName ;
	private int studentRollnumber;
	private String studentDept;
	private int  studentyearOfStudy;
	private float cgpa;

	/**
	 * @param studentName
	 * @param studentRollnumber
	 * @param studentDept
	 * @param studentyearOfStudy
	 * @param cgpa
	 */
	public Student(String studentName, int studentRollnumber, String studentDept, int studentyearOfStudy, float cgpa , String studentPcmMark) {
		super();
		this.studentName = studentName;
		this.studentRollnumber = studentRollnumber;
		this.studentDept = studentDept;
		this.studentyearOfStudy = studentyearOfStudy;
		this.cgpa = cgpa;
		
	}
	public Student(String updatedname, int updatedrollnumber, String updateddept, int updatedyear, float updatedccgpa) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the cgpa
	 */
	public float getCgpa() {
		return cgpa;
	}
	/**
	 * @param cgpa the cgpa to set
	 */
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	static private String studentSchool =  " Ambedkar " ;
	public int getstudentRollnumber() {
		return studentRollnumber;
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
	/**
	 * @return the studentRollnumber
	 */
	public int getStudentRollnumber() {
		return studentRollnumber;
	}
	/**
	 * @param studentRollnumber the studentRollnumber to set
	 */
	public void setStudentRollnumber(int studentRollnumber) {
		this.studentRollnumber = studentRollnumber;
	}
	/**
	 * @return the studentDept
	 */
	public String getStudentDept() {
		return studentDept;
	}
	/**
	 * @param studentDept the studentDept to set
	 */
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	/**
	 * @return the studentyearOfStudy
	 */
	public int getStudentyearOfStudy() {
		return studentyearOfStudy;
	}
	/**
	 * @param studentyearOfStudy the studentyearOfStudy to set
	 */
	public void setStudentyearOfStudy(int studentyearOfStudy) {
		this.studentyearOfStudy = studentyearOfStudy;
	}
	/**
	 * @return the studentSchool
	 */
	public static String getStudentSchool() {
		return studentSchool;
	}
	/**
	 * @param studentSchool the studentSchool to set
	 */
	public static void setStudentSchool(String studentSchool) {
		Student.studentSchool = studentSchool;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollnumber=" + studentRollnumber + ", studentDept="
				+ studentDept + ", studentyearOfStudy=" + studentyearOfStudy + ", cgpa=" + cgpa +  "]";
	}
	
}

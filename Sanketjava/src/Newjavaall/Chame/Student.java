
package Newjavaall.Chame;

public class Student {
	private int studId;
	private String studName;
	private Address studAddress; //Address[city,state,pincode,landmark]		
	private int studAge;
	private char studGender;
	private String studEmail;
	private Marks studMarks;	//Marks [Phy,chem,math]
	public Student() 
			{
		
		// TODO Auto-generated constructor stub
			}
	public Student(int studId, String studName, Address studAddress, int studAge, char studGender, String studEmail,Marks studMarks) 
		{
		
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
		this.studAge = studAge;
		this.studGender = studGender;
		this.studEmail = studEmail;
		this.studMarks = studMarks;
		}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress + ", studAge="
				+ studAge + ", studGender=" + studGender + ", studEmail=" + studEmail + ", studMarks=" + studMarks
				+ "]";
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Address getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(Address studAddress) {
		this.studAddress = studAddress;
	}
	public int getStudAge() {
		return studAge;
	}
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	public char getStudGender() {
		return studGender;
	}
	public void setStudGender(char studGender) {
		this.studGender = studGender;
	}
	public String getStudEmail() {
		return studEmail;
	}
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	public Marks getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(Marks studMarks) {
		this.studMarks = studMarks;
	}
	

	
}





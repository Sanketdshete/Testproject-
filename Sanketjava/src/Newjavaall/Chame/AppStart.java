
package Newjavaall.Chame;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppStart {
	
	
	static public int takeUsernumericInput(Scanner sc) {
		for(int i=0;i<3;i++) {
			try {
				if(i!=0) {
					System.out.println("Enter Correct Value : ");
				}
				int num = Integer.parseInt(sc.next());
				return num;
			}catch(NumberFormatException e) {
				System.out.println("Enter Numberic Value..!");
			}

		}
		System.out.println("Stopping the application..>!");
		System.exit(0);
		return 0;
	}

	public static Student getStudentUserInput(Scanner sc) {
		System.out.println("Enter Student Id : ");
		int studId = takeUsernumericInput(sc);//sc.nextInt();
		System.out.println("Enter Student Name : ");
		String name = sc.next();
		System.out.println("Enter Student Age : ");
		int age = takeUsernumericInput(sc);
		System.out.println("Enter Student Email : ");
		String email = sc.next();
		System.out.println("Enter Student Gender : ");
		char gender = sc.next().toCharArray()[0];//"Male" --> M
		System.out.println(".....Enter Address Details.....");
		Address adr = getStudentAddressInput(sc);
		System.out.println(".....Enter Marks Details.....");
		Marks marks = getStudentMarksInput(sc);
		return new Student(studId, name, adr, age, gender, email, marks);
	}
	
	public static Address getStudentAddressInput(Scanner sc) {
			System.out.println("Enter City : ");
			String city = sc.next();
			System.out.println("Enter State : ");
			String state = sc.next();
			System.out.println("Enter Pincode : ");
			int pincode = takeUsernumericInput(sc);
			System.out.println("Enter LandMark : ");
			String landMark = sc.next();
			return new Address(city, state, pincode, landMark);
	}
	
	public static Marks getStudentMarksInput(Scanner sc) {
		System.out.println("Enter Phy Marks : ");
		int phy = takeUsernumericInput(sc);
		System.out.println("Enter Chem Marks : ");
		int chem = takeUsernumericInput(sc);
		System.out.println("Enter Math Marks : ");
		int math = takeUsernumericInput(sc);
		return new Marks(phy,chem,math);
	}
	
	public static void main(String[] args) {
		Student stud  = null;
		int studId = 0;
		StudentServiceImpl service = new StudentServiceImpl();
		
		
		while(true) {
			System.out.println("***********************************************************************");
			System.out.println("1. Add Student \n"
					+ "2. Delete Student \n"
					+ "3. Update Student \n"
					+ "4. Get Student \n"
					+ "5. Get All Student \n");
			
			System.out.println("Enter Your Choice : ");
			Scanner sc = new Scanner(System.in);
			int choice = takeUsernumericInput(sc);
			switch (choice) {
			case 1:
				stud  = getStudentUserInput(sc);
				try {
					service.addStudent(stud);
				} catch (DuplicateStudent e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidStudent e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter Student Id for Delete : ");
				studId = takeUsernumericInput(sc);
				service.deleteStudent(studId);
				break;
			case 3:
				stud  = getStudentUserInput(sc);
				service.updateStudent(stud.getStudId(),stud);
				break;
			case 4:
				System.out.println("Enter Student Id : ");
				studId = takeUsernumericInput(sc);
				Student st = service.getStudent(studId);
				if(st==null) {
					System.out.println("No Student Found..!");
				}else {
					System.out.println(st);
				}
				break;
			case 5:
				Student studs[] = service.getAllStudents();
				System.out.println(Arrays.toString(studs));
				break;

			default:
				System.out.println("Invalid Choice...!");
				break;
			}
			
			
			System.out.println("Do you want to Continue : Press O for No or 1 for yes ");
			int ch = sc.nextInt();
			if(ch <= 0) {
				
			}
			}
		
			
		}
		
		
		
	}


// Program to Demonstrate Student Data

package Assignments;
import java.util.Scanner;
import java.util.Objects;

public class Example1 {
	
	protected String studentName;
	protected String studentClass;
	protected String studentSection;
	protected int studentMarks1;
	protected int studentMarks2;
	protected int studentMarks3;
	protected int studentMarks4;
	
	public Example1() {
		
	}

	public Example1(String studentName, String studentClass, String studentSection, int studentMarks1,
			int studentMarks2, int studentMarks3, int studentMarks4) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentSection = studentSection;
		this.studentMarks1 = studentMarks1;
		this.studentMarks2 = studentMarks2;
		this.studentMarks3 = studentMarks3;
		this.studentMarks4 = studentMarks4;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentSection() {
		return studentSection;
	}

	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}

	public int getStudentMarks1() {
		return studentMarks1;
	}

	public void setStudentMarks1(int studentMarks1) {
		this.studentMarks1 = studentMarks1;
	}

	public int getStudentMarks2() {
		return studentMarks2;
	}

	public void setStudentMarks2(int studentMarks2) {
		this.studentMarks2 = studentMarks2;
	}

	public int getStudentMarks3() {
		return studentMarks3;
	}

	public void setStudentMarks3(int studentMarks3) {
		this.studentMarks3 = studentMarks3;
	}

	public int getStudentMarks4() {
		return studentMarks4;
	}

	public void setStudentMarks4(int studentMarks4) {
		this.studentMarks4 = studentMarks4;
	}
	
	public int getTotal() {
		return (int) (studentMarks1 + studentMarks2 + studentMarks3 + studentMarks4);
	}
	
	public float getPercentage() {
		return (float) (getTotal()/4f);
	}

	@Override
	public String toString() {
		return "Example1 [studentName=" + studentName + ", studentClass=" + studentClass + ", studentSection="
				+ studentSection + ", studentMarks1=" + studentMarks1 + ", studentMarks2=" + studentMarks2
				+ ", studentMarks3=" + studentMarks3 + ", studentMarks4=" + studentMarks4 + "]";
	}
	
	public void acceptData() {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Name");
		studentName = a.nextLine();
		System.out.println("Enter Class");
		studentClass = a.nextLine();
		System.out.println("Enter Section");
		studentSection = a.nextLine();
		System.out.println("Enter Hindi Marks");
		studentMarks1 = a.nextInt();
		System.out.println("Enter English Marks");
		studentMarks2 = a.nextInt();
		System.out.println("Enter Maths Marks");
		studentMarks3 = a.nextInt();
		System.out.println("Enter Science Marks");
		studentMarks4 = a.nextInt();
	}
	
	public void showData() {
		System.out.println("Student Name = " +studentName);
		System.out.println("Student Class = " +studentClass);
		System.out.println("Student Section = " +studentSection);
		System.out.println("Marks in Hindi = " + studentMarks1 + "\n Marks in English = " + studentMarks2 +
                "\n Marks in Maths = " + studentMarks3 + "\n Marks in Science = " + studentMarks4);
        System.out.println("Total Marks = " + getTotal());
        System.out.println("Percentage = " + getPercentage());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studentClass, studentMarks1, studentMarks2, studentMarks3, studentMarks4, studentName,
				studentSection);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Example1 other = (Example1) obj;
		return Objects.equals(studentClass, other.studentClass) && studentMarks1 == other.studentMarks1
				&& studentMarks2 == other.studentMarks2 && studentMarks3 == other.studentMarks3
				&& studentMarks4 == other.studentMarks4 && Objects.equals(studentName, other.studentName)
				&& Objects.equals(studentSection, other.studentSection);
	}
	
	public static void main(String args[]) {
        Example1 s = new Example1();
        // Student s1 = new Student("Ranjit", "12th", "A", 90, 95, 92, 91);
        s.acceptData();
        s.showData();
        // s1.showData();
    }	
	
}

// Program to Demonstrate Student Data using OOP's Concept

import java.util.Scanner;

class Student {
    protected String studentName;
    protected String studentClass;
    protected String studentSection;
    protected int studentMarks1;
    protected int studentMarks2;
    protected int studentMarks3;
    protected int studentMarks4;

    public Student() {
    }

    public Student(String studentName, String studentClass, String studentSection, int studentMarks1, int studentMarks2,
            int studentMarks3, int studentMarks4) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentSection = studentSection;
        this.studentMarks1 = studentMarks1;
        this.studentMarks1 = studentMarks2;
        this.studentMarks1 = studentMarks3;
        this.studentMarks1 = studentMarks4;
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
        return studentMarks1;
    }

    public void setStudentMarks2(int studentMarks1) {
        this.studentMarks1 = studentMarks1;
    }

    public int getStudentMarks3() {
        return studentMarks1;
    }

    public void setStudentMarks3(int studentMarks1) {
        this.studentMarks1 = studentMarks1;
    }

    public int getStudentMarks4() {
        return studentMarks1;
    }

    public void setStudentMarks4(int studentMarks1) {
        this.studentMarks1 = studentMarks1;
    }

    public int getTotal() {
        return (int) (studentMarks1 + studentMarks2 + studentMarks3 + studentMarks4);
    }

    public float getPercentage() {
        return (float) (getTotal() / 4f);
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
        System.out.println("Student Name = " + studentName);
        System.out.println("Student Class = " + studentClass);
        System.out.println("Student Section = " + studentSection);
        System.out.println("Marks in Hindi = " + studentMarks1 + " Marks in English = " + studentMarks2 +
                " Marks in Maths = " + studentMarks3 + " Marks in Science = " + studentMarks4);
        System.out.println("Total Marks = " + getTotal());
        System.out.println("Percentage = " + getPercentage());
    }

    public static void main(String args[]) {
        Student s = new Student();
        // Student s1 = new Student("Ranjit", "12th", "A", 90, 95, 92, 91);
        s.acceptData();
        s.showData();
        // s1.showData();
    }
}

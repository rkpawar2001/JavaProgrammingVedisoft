import java.util.Scanner;
class EmployeeMain {
	protected String code;
	protected String name;

	public EmployeeMain() {
	}

	public EmployeeMain(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode() {
		this.code = code;
	}

	
	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public void acceptData() {
		Scanner rk = new Scanner(System.in);
		System.out.println("Enter Your Code : ");
		code = rk.nextLine();
		System.out.println("Enter Your Name : ");
		name = rk.nextLine();
	}

	public void showData() {
		System.out.println("Code = " +code);
		System.out.println("Name = " +name);
	}

	public static void main(String args[]) {
		EmployeeMain e = new EmployeeMain();

		e.acceptData();
		e.showData();
	}
}
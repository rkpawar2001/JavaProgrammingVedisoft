import java.util.Scanner;
class TempEmp extends EmployeeMain {

	protected String wageGrade;
	protected int daysWorked;

	public TempEmp() {
	}

	public TempEmp(String wageGrade, int daysWorked) {
		this.wageGrade = wageGrade;
		this.daysWorked = daysWorked;
	}

	public String getWageGrade() {
		return wageGrade;
	}

	public void setWageGrade() {
		this.wageGrade = wageGrade;
	}

	
	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked() {
		this.daysWorked = daysWorked;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Your Wage Grade : ");
		wageGrade = a.nextLine();
		
		System.out.println("Enter Your Working Days : ");
		daysWorked = a.nextInt(); 
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("Wage Grade = " +wageGrade);
		System.out.println("Days Worked = " +daysWorked);
	}

	public static void main(String args[]) {
		TempEmp t = new TempEmp();
		
		t.acceptData();
		t.showData();
		//super.showData();
	}
}
import java.util.Scanner;
class PerEmp extends EmployeeMain {

	protected String employeeDepartment;
    	protected String employeeDesignation;
    	protected float employeeBaseSalary;

	public PerEmp() {
	}

	public PerEmp(String employeeDepartment, String employeeDesignation,
            float employeeBaseSalary) {
		this.employeeDepartment = employeeDepartment;
        	this.employeeDesignation = employeeDesignation;
        	this.employeeBaseSalary = employeeBaseSalary;
	}

    	public String getEmployeeDepartment() {
	        return employeeDepartment;
    	}

	public void setEmployeeDepartment(String employeeDepartment) {
        	this.employeeDepartment = employeeDepartment;
    	}

	public String getEmployeeDesignation() {
        	return employeeDesignation;
    	}

	public void setEmployeeDesignation(String employeeDesignation) {
        	this.employeeDesignation = employeeDesignation;
    	}

    	public float getEmployeeBaseSalary() {
        	return employeeBaseSalary;
    	}

    	public void setEmployeeBaseSalary(float employeeBaseSalary) {
        	this.employeeBaseSalary = employeeBaseSalary;
    	}


	@Override
	public void acceptData() {
		super.acceptData();

		Scanner a = new Scanner(System.in);

        	System.out.println("Enter Department");
        	employeeDepartment = a.nextLine();

        	System.out.println("Enter Designation");
        	employeeDesignation = a.nextLine();

        	System.out.println("Enter Basic Salary");
        	employeeBaseSalary = a.nextInt();
	}

	@Override
	public void showData() {
		super.showData();

		System.out.println("Employee Department = " + employeeDepartment);
        	System.out.println("Employee Designation = " + employeeDesignation);
        	System.out.println("Employee Basic Salary = " + employeeBaseSalary);
	}

	public static void main(String args[]) {
		PerEmp p = new PerEmp();
		
		p.acceptData();
		p.showData();
		//super.showData();
	}
}
// Program to Demonstrate Employee Data using OOP's Concept

import java.util.Scanner;

class Employee {
	protected String employeeName;
	protected String employeeDepartment;
	protected String employeeDesignation;
	protected float employeeBaseSalary;

    	public Employee() {
    	}

	public Employee(String employeeName, String employeeDepartment, String employeeDesignation,
            float employeeBaseSalary) {
		this.employeeName = employeeName;
        	this.employeeDepartment = employeeDepartment;
        	this.employeeDesignation = employeeDesignation;
        	this.employeeBaseSalary = employeeBaseSalary;
    	}

    	public String getEmployeeName() {
        	return employeeName;
    	}

	public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
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

	// public int getIncentives() {
    	// return (int) (employeeBaseSalary );
    	// }

    	public float getHra() {
        	return (float) (employeeBaseSalary * 20 / 100);
    	}

    	public float getDa() {
        	return (float) (employeeBaseSalary * 10 / 100);
    	}	

    public float getCa() {
        return (float) (employeeBaseSalary * 10 / 100);
    }

    public void acceptData() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Name");
        employeeName = a.nextLine();
        System.out.println("Enter Department");
        employeeDepartment = a.nextLine();
        System.out.println("Enter Designation");
        employeeDesignation = a.nextLine();
        System.out.println("Enter Basic Salary");
        employeeBaseSalary = a.nextInt();
    }

    public void showData() {
        System.out.println("Employee Name = " + employeeName);
        System.out.println("Employee Department = " + employeeDepartment);
        System.out.println("Employee Designation = " + employeeDesignation);
        System.out.println("Employee Basic Salary = " + employeeBaseSalary);
        System.out.println(
                "Employee Incentives : " + '\n' + "HRA = " + getHra() + '\n' + "DA = " + getDa() + '\n' + "CA = "
                        + getCa());
    }

    public static void main(String args[]) {
        Employee e = new Employee();
        e.acceptData();
        e.showData();
    }
}

package com.vedisoft.jdbc.pojos;

import java.util.Date;
import java.util.Objects;

public class Employee {
	
		private int empId;
		private String empName;
		private int deptId;
		private String designation;
		private Date doj;
		private int salary;
		
		public Employee() {
			empName = new String();
			designation = new String();
			doj = new Date();
		}

		public Employee(String empName, int deptId, Date doj, int salary) {
			super();
			this.empName = empName;
			this.deptId = deptId;
			this.doj = doj;
			this.salary = salary;
		}

		public Employee(int empId, String empName, int deptId, String designation, Date doj, int salary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.deptId = deptId;
			this.designation = designation;
			this.doj = doj;
			this.salary = salary;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public Date getDoj() {
			return doj;
		}

		public void setDoj(Date doj) {
			this.doj = doj;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public int hashCode() {
			return Objects.hash(deptId, designation, doj, empId, empName, salary);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return deptId == other.deptId && Objects.equals(designation, other.designation)
					&& Objects.equals(doj, other.doj) && empId == other.empId && Objects.equals(empName, other.empName)
					&& salary == other.salary;
		}

		@Override
		public String toString() {
			return "Employees [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", designation="
					+ designation + ", doj=" + doj + ", salary=" + salary + "]";
		}
		
}

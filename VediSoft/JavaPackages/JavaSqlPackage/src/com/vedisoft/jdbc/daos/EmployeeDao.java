package com.vedisoft.jdbc.daos;

import com.vedisoft.jdbc.utilities.MyDatabaseConnection;
import com.vedisoft.jdbc.pojos.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import com.vedisoft.jdbc.utilities.*;

public class EmployeeDao {
	
	public boolean createEmployee(Employee employee) {
		Connection conn = MyDatabaseConnection.getConnection();
		
		try {
			String sql = "insert into employees (empName,"+ " deptId, designation, doj, salary)values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, employee.getEmpName());
			ps.setInt(2, employee.getEmpId());
			ps.setString(3, employee.getDesignation());
			java.sql.Date dt = new java.sql.Date(employee.getDoj().getTime());
			ps.setDate(4, dt);
			ps.setInt(5, employee.getSalary());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." +sq);
			return false;
		}
		return true;
	}
	
	public boolean editEmployee(Employee employee) {
		Connection conn = MyDatabaseConnection.getConnection();
		
		try {
			String sql = "update employees set empName = ?," + " deptId = ?, designation = ?, doj = ?, salary = ? where empId = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, employee.getEmpName());
			ps.setInt(2, employee.getEmpId());
			ps.setString(3, employee.getDesignation());
			java.sql.Date dt = new java.sql.Date(employee.getDoj().getTime());
			ps.setDate(4, dt);
			ps.setInt(5, employee.getSalary());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit row." +sq);
			return false;
		}
		return true;
	}
	
	public boolean removeEmployee(int empId) {
		Connection conn = MyDatabaseConnection.getConnection();
		
		try {
			String sql = "delete from employees where empId = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, empId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete row." +sq);
			return false;
		}
		return true;
	}
	
	public Employee find(int empId) {
		Connection conn = MyDatabaseConnection.getConnection();
		Employee employee = new Employee();
		try {
			String sql = "select * from employees where empId = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				employee.setEmpId(empId);
				employee.setEmpName(rs.getString("empname"));
				employee.setDeptId(rs.getInt("deptid"));
				employee.setDesignation(rs.getString("designation"));
				java.sql.Date dt = rs.getDate("doj");
				employee.setSalary(rs.getInt("salary"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch row." +sq);
		}
		return employee;
	}
	
	public ArrayList<Employee> findAll() {
		Connection conn = MyDatabaseConnection.getConnection();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		try {
			String sql = "select * from employees";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("empid"));
				employee.setEmpName(rs.getString("empname"));
				employee.setDeptId(rs.getInt("deptid"));
				employee.setDesignation(rs.getString("designation"));
				java.sql.Date dt = rs.getDate("doj");
				employee.setSalary(rs.getInt("salary"));
				listEmployees.add(employee);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch rows." +sq);
		}
		return listEmployees;
	}
	
	public ArrayList<Employee> findAllByName(String name) {
		Connection conn = MyDatabaseConnection.getConnection();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		try {
			String sql = "select * from employees where empname like ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("empid"));
				employee.setEmpName(rs.getString("empname"));
				employee.setDeptId(rs.getInt("deptid"));
				employee.setDesignation(rs.getString("designation"));
				java.sql.Date dt = rs.getDate("doj");
				employee.setSalary(rs.getInt("salary"));
				listEmployees.add(employee);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch rows." +sq);
		}
		return listEmployees;
	}
	
	public ArrayList<Employee> findAllByDepartment(int deptId) {
		Connection conn = MyDatabaseConnection.getConnection();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		try {
			String sql = "select * from employees where deptid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, deptId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("empid"));
				employee.setEmpName(rs.getString("empname"));
				employee.setDeptId(rs.getInt("deptid"));
				employee.setDesignation(rs.getString("designation"));
				java.sql.Date dt = rs.getDate("doj");
				employee.setSalary(rs.getInt("salary"));
				listEmployees.add(employee);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch rows." +sq);
		}
		return listEmployees;
	}
	
	public ArrayList<Employee> getEmployeesWithDeptId(int deptId) {
		Connection conn = MyDatabaseConnection.getConnection();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		try {
			String sql = "select * from employees where deptid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, deptId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("empid"));
				employee.setEmpName(rs.getString("empname"));
				employee.setDeptId(rs.getInt("deptid"));
				employee.setDesignation(rs.getString("designation"));
				java.sql.Date dt = rs.getDate("doj");
				employee.setSalary(rs.getInt("salary"));
				listEmployees.add(employee);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch rows." +sq);
		}
		return listEmployees;
	}
	
	public ArrayList<Employee> getEmployeesByName(String name) {
		Connection conn = MyDatabaseConnection.getConnection();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		try {
			String sql = "select * from employees where empname like ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("empid"));
				employee.setEmpName(rs.getString("empname"));
				employee.setDeptId(rs.getInt("deptid"));
				employee.setDesignation(rs.getString("designation"));
				java.sql.Date dt = rs.getDate("doj");
				employee.setSalary(rs.getInt("salary"));
				listEmployees.add(employee);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch rows." +sq);
		}
		return listEmployees;
	}
	
	public ArrayList<Employee> getEmployeesByDesignation(String name) {
		Connection conn = MyDatabaseConnection.getConnection();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		try {
			String sql = "select * from employees where designation like ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("empid"));
				employee.setEmpName(rs.getString("empname"));
				employee.setDeptId(rs.getInt("deptid"));
				employee.setDesignation(rs.getString("designation"));
				java.sql.Date dt = rs.getDate("doj");
				employee.setSalary(rs.getInt("salary"));
				listEmployees.add(employee);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch rows." +sq);
		}
		return listEmployees;
	}
	
	public ArrayList<Employee> getEmployeesBySalary(int salary) {
		Connection conn = MyDatabaseConnection.getConnection();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		try {
			String sql = "select * from employees where salary like ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, salary + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("empid"));
				employee.setEmpName(rs.getString("empname"));
				employee.setDeptId(rs.getInt("deptid"));
				employee.setDesignation(rs.getString("designation"));
				java.sql.Date dt = rs.getDate("doj");
				employee.setSalary(rs.getInt("salary"));
				listEmployees.add(employee);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch rows." +sq);
		}
		return listEmployees;
	}
	
	public static void main(String arg[]) {
		java.util.Date dt = DateUtils.convertDate("01-03-2023");
//		Employee employee = new Employee();
//		EmployeeDao employeeDao = new EmployeeDao();
//		employeeDao.getEmployeesBySalary(employee);
		
		 EmployeeDao employeeDao = new EmployeeDao();
		 ArrayList<Employee> al = employeeDao.getEmployeesBySalary(45000);
		 for (Employee employee : al)
		 System.out.println(employee);

		
	}
	
}

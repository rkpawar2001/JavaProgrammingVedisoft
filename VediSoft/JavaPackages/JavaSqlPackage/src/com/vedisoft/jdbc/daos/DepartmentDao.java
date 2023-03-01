package com.vedisoft.jdbc.daos;

import com.vedisoft.jdbc.utilities.MyDatabaseConnection;
import com.vedisoft.jdbc.pojos.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import com.vedisoft.jdbc.utilities.*;

public class DepartmentDao {
	
	public boolean createDepartment(Department department) {
		Connection conn = MyDatabaseConnection.getConnection();
		
		try {
			String sql = "insert into departments (deptName," + " deptId, deptdetails)values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, department.getDeptName());
			ps.setInt(2, department.getDeptId());
			ps.setString(3, department.getDeptDetails());

			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." +sq);
			return false;
		}
		return true;
	}
	
	public boolean editDepartment(Department department) {
		Connection conn = MyDatabaseConnection.getConnection();
		
		try {
			String sql = "update departments set deptName = ?," + " deptId = ?, deptname = ?, deptdetails = ? where deptId = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, department.getDeptName());
			ps.setInt(2, department.getDeptId());
			ps.setString(3, department.getDeptDetails());

			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit row." +sq);
			return false;
		}
		return true;
	}
	
	public boolean removeDepartment(int deptId) {
		Connection conn = MyDatabaseConnection.getConnection();
		
		try {
			String sql = "delete from departments where deptId = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, deptId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete row." +sq);
			return false;
		}
		return true;
	}
	
	public Department find(int deptId) {
		Connection conn = MyDatabaseConnection.getConnection();
		Department department = new Department();
		try {
			String sql = "select * from departments where deptId = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, deptId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				department.setDeptId(deptId);
				department.setDeptId(rs.getInt("deptid"));
				department.setDeptName(rs.getString("deptname"));
				department.setDeptDetails(rs.getString("deptdetails"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch row." +sq);
		}
		return department;
	}
	
	public ArrayList<Department> findAll() {
		Connection conn = MyDatabaseConnection.getConnection();
		ArrayList<Department> listDepartments = new ArrayList<Department>();
		try {
			String sql = "select * from departments";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Department department = new Department();
				department.setDeptId(rs.getInt("deptid"));
				department.setDeptName(rs.getString("deptname"));
				department.setDeptDetails(rs.getString("deptdetails"));
				
				listDepartments.add(department);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch rows." +sq);
		}
		return listDepartments;
	}
	
	public ArrayList<Department> getDepartmentsWithDeptId(int deptId) {
		Connection conn = MyDatabaseConnection.getConnection();
		ArrayList<Department> listDepartments = new ArrayList<Department>();
		try {
			String sql = "select * from deparments where deptid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, deptId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Department deparment = new Department();
				deparment.setDeptId(rs.getInt("deptid"));
				deparment.setDeptName(rs.getString("deptname"));
				deparment.setDeptDetails(rs.getString("deptdetails"));

				listDepartments.add(deparment);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to fetch rows." +sq);
		}
		return listDepartments;
	}
	
	public static void main(String arg[]) {
//		java.util.Date dt = DateUtils.convertDate("12-02-2023");
		Department department = new Department(4, "Developer","Development Team");
		DepartmentDao departmentDao = new DepartmentDao();
		departmentDao.createDepartment(department);
	}
	
}

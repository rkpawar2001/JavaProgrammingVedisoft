package com.vedisoft.jdbc.pojos;

//import java.util.Date;
import java.util.Objects;

public class Department {
	
		private int deptId;
		private String deptName;
		private String deptDetails;
		
		public Department() {
			deptName = new String();
			deptDetails = new String();
		}

		public Department(String deptName, String deptDetails) {
			this.deptName = deptName;
			this.deptDetails = deptDetails;
		}

		public Department(int deptId, String deptName, String deptDetails) {
			this.deptId = deptId;
			this.deptName = deptName;
			this.deptDetails = deptDetails;
		}

		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		public String getDeptDetails() {
			return deptDetails;
		}

		public void setDeptDetails(String deptDetails) {
			this.deptDetails = deptDetails;
		}

		@Override
		public int hashCode() {
			return Objects.hash(deptDetails, deptId, deptName);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Department other = (Department) obj;
			return Objects.equals(deptDetails, other.deptDetails) && deptId == other.deptId
					&& Objects.equals(deptName, other.deptName);
		}

		@Override
		public String toString() {
			return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptDetails=" + deptDetails + "]";
		}	
		
}

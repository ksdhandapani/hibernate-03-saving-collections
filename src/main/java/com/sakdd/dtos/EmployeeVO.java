package com.sakdd.dtos;

import java.util.Collection;
import java.util.HashSet;

import com.sakdd.models.Address;

public class EmployeeVO {
	private Integer employeeId;
	private String employeeName;
	private String gender;
	private String department;
	private Collection<Address> addressList = new HashSet<>();

	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", gender=" + gender
				+ ", department=" + department + ", addressList=" + addressList + "]";
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Collection<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(Collection<Address> addressList) {
		this.addressList = addressList;
	}

	public EmployeeVO(Integer employeeId, String employeeName, String gender, String department,
			Collection<Address> addressList) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.department = department;
		this.addressList = addressList;
	}

	public EmployeeVO() {
		super();
	}

}

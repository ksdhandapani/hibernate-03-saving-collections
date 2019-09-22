package com.sakdd.models;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Integer employeeId;
	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "department")
	private String department;

	@ElementCollection
	@JoinTable(name = "employee_address",joinColumns = @JoinColumn(name="employee_id"))
	private Collection<Address> addressList = new HashSet<>();

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

	public Employee(Integer employeeId, String employeeName, String gender, String department,
			Collection<Address> addressList) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.department = department;
		this.addressList = addressList;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", gender=" + gender
				+ ", department=" + department + ", addressList=" + addressList + "]";
	}

	public Employee() {
		super();
	}

}

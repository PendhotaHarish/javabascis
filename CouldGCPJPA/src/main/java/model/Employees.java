package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Master")
public class Employees 
{
	@Id
	@Column(name="emp_id")
	private int emid;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_salary")
	private double empSalary;
	@ManyToOne
	@JoinColumn(name="id")
	//@Column(name="departmentId")
	private Department department;
	public int getEmid() {
		return emid;
	}
	public void setEmId(int id) {
		this.emid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}

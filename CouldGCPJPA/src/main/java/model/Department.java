package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Department_Table")
public class Department 
{
	@Id
	@Column(name = "department_id")
	private int id;
	@Column(name="department_name")
	private String name;
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	private Set<Employees> employees=new HashSet<Employees>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employees> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employees> employees) {
		this.employees = employees;
	}
	public void addEmployess(Employees employees)
	{
		employees.setDepartment(this);
		this.getEmployees().add(employees);
	}
}

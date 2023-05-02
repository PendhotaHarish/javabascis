package model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/*
 * 
 * @Entity
 * @Id
 * @GeneratedValue
 * @Column(name="xyz", nullable=true,unique=true, length=150)
 * @OneToOne(mappedBy="department",
 * @OneToMany
 * @ManyToOne
 * Customer
 * {
 * List<Order> listOfOredr
 * }
 * @ManyToMany(fetch=FetchType.LAZY, cascade=CasedeType.)
 * ORM 
 * Object 
 * 
 * 
 * 
 */



@Entity
@Table(name="person_details")
@Inheritance(strategy=InheritanceType.JOINED)			//This annotation must be written only on parent class
public class Person  {
	@Id
	private int personId;
	private String name;
	public Person(int personId, String name) {
		super();
		this.personId = personId;
		this.name = name;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
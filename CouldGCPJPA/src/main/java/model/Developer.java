package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Developer 
{
	@Id
	private int devId;
	private String devName;
	private Long devPhone;
	private String devMail;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="projectId")
	private Project project;
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public Long getDevPhone() {
		return devPhone;
	}
	public void setDevPhone(Long devPhone) {
		this.devPhone = devPhone;
	}
	public String getDevMail() {
		return devMail;
	}
	public void setDevMail(String devMail) {
		this.devMail = devMail;
	}
}

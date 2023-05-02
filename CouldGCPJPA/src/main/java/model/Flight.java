package model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/*
 * Flight==Flight_Details
 * Many Flight refer to Single object of shedule
 * 
 * 
 */
@Entity
@Table(name = "Flight_Details")
public class Flight {
	@Id
	private int flightNumber;
	private String flightName;
	@ManyToOne
	@JoinColumn(name="scheduleId")
	private Schedule schedule;
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
}
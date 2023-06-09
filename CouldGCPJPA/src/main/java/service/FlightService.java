package service;
import java.util.List;
import model.Flight;
public interface FlightService 
{
	public Flight searchFlightById(int id);
	public List<Flight> getAllFlightWithSchedule();
	//public Schedule removeFlight(int id);
	public void removeFlight(int id);
	public int updateFlight(int id);
}
package ticketingManagementSystem;

/**

 * @author Phillip Leicester

 * @version 1.0

 * @created 13/7/2019 2:34:05 PM

 */
public class Station {

	private String StationList;  // add attribute to store this Station's Name
	private String stationName;  // enter name of station
	
	private String[] List = {"StationList"}; // update list of stations.
	
	public Station(String _stationName) {
		this.setstationName(_stationName);
		this.isValid();
	}
	
	private void setstationName(String _stationName) {
		// TODO Auto-generated method stub
		
	}

	public String setstationName() {
		return this.setstationName();
	}
	
	public String getstationName(){
		return this.getstationName();
	}
	
	public boolean isValid() {// check if the station name is 	valid - must not be in unassignedStationList
	//loop through the unassignedStationList and find station 	name, then return false, otherwise return true
		return true;
	}

	public String toString() {
		return "Station ";
	}
	
}//end Station

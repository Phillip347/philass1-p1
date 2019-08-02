
package ticketingManagementSystem; 

/**
 
* @author Phillip Leicester

* @version 1.0
 
* @created 24/7/2019 10:05:35 AM

public class Timetable  {

	private String arrTime;  // arrival time
	private String depTime; // departure time 
	private String weekDay // day of the week
	
	private static int nextplatformNum = 0;  // static 	variable on class that will be used to generate next 	platform number. 
	
	/**
	 * 
	 * @param _trainName
	 * @param _destation
	 * @param _platform
	 * @param _depTime
	 * @param _weekDay
	 */	
	public Train(String _trainName, String _destination, int 	_platform, String _depTime, String _weekDay ){
		this.settrainName(_trainName);
		this.setdestination(_destination);
		this.setplatform(_platform);
		this.setdepTime(_depTime);
		this.setweekDay(_weekDay);
	}


	/**
	 * 
	 * @param _trainName
	 * @param _destination
	 * @param _platform
	 * @param _arrTime
	 * @param _weekDay
	 */
	public Train(String _trainName, String _destination, int 	_platform, String _arrTime, String _weekDay){
		this.setName(_trainName);
		this.setdestination(_destination);
		this.setPlatform(_platform);
		this.setarrTime(_arrTime);
		this.setweekDay(_weekDay);
	}
	
	

	private void settrainName() {  // generate next valid 	train 	name
	// get next train name, string for unique name
		
	//create the train name for required interstate service
		
		this.trainName = ""; // String;
		
	}


	private void setDestination(String _destination) {
	// save _destination to the destination service of this 	Train
		this.destination = _destination;
	}


	private void setPlatform(int _platform) {
	// save _platform to the platform attribute on this Train
	this.platform = _platform;
	}

	private void setdepTime(String _depTime){
	// save _depTime to the departure time attribute for train
	}

	private void setarrTime(String _arrTime) {
	// save _arrTime for the arrival time at destination
	}

	private void setweekDay(String _weekDay) {
	// save _weekDay for arrival and departure of train service
	}

	public String gettrainName() {
	// get the name of this train to return this.trainName;
	}
	

	public String toString() {
		String details = "Train" + this.trainName + " to " + 	this.destination + " from " + this.platform + this.deptime + 	+ this.arrTime "on" + this.weekDay;
		if (this.destination != null) 
			service = service + " Travelling to " + 	this.destination.getDestination();
		if (this.platform()) 
			service = service + " is departing from the 			following platform " + this.platform.getPlatform();
		return service;
		if (this.depTime())
			service = service + "departure time of service" + 			this.depTime.getdepTime();
		if (this.arrTime())
			service = service + "arrival time of service" + 			this.arrTime.getarrTime();
		if (this.weekDay())
			service = service + "day of the week" +
			this.weekDay.getweekDay();
		
	}	
	
	
}//end Timetable


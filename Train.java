 
package ticketingManagementSystem;
 

/**
 
 * @author Phillip Leicester

 * @version 1.0

 * @created 13/7/2019 3:00:12 PM

public class Train extends Travel {

	private String trainName;  // name of train e.g."Spirit 	of Progress".
	private String destination;	  // place of destination 
	e.g. "Sydney"
	private int platform // platform number
	
	private static int nextplatformNum = 0;  // static 	variable on class that will be used to generate next 	platform number. 
	
	/**
	 * 
	 * @param _trainName
	 * @param _destation
	 * @param _platform
	 */	
	public Train(String _trainName, String _destination, int 	_platform ){
		this.settrainName(_trainName);
		this.setdestination(_destination);
		this.setplatform(_platform);
	}


	/**
	 * 
	 * @param _trainName
	 * @param _destination
	 * @param _platform
	 */

	public Train(String _trainName, String _destination, int 	_platform){
		this.setName(_trainName);
		this.Destination(_destination);
		this.setPlatform(_platform);

	}
	

	private void settrainName() {  // generate next valid 	train name
	// get next train name, string for unique name
		
	//create the train name for required interstate service
		
		this.trainName = _trainName; // String;
		
	}


	private void setDestination(String _destination) {
	// save _destination to the destination service of this 	Train
		this.destination = _destination;
	}


	private void setPlatform(int _platform) {
	// save _platform to the platform attribute on this Train
	this.platform = _platform;
	}


	public String gettrainName() {
	// get the name of this train to return this.trainName;
		return trainName;
	}
	

	public String toString() {
		String details = "Train" + this.trainName + " to " + 		this.destination + " from " + this.platform;
		if (this.destination != null) 
		service = service + " Travelling to " + 				this.destination.getDestination();
		if (this.platform()) 
		service = service + " is departing from the 			following platform " + this.platform.getPlatform();
		return service;
	}	
	
	
}//end Train

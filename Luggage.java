package ticketingManagementSystem;
 

/**
 
* @author Phillip Leicester 
 
* @version 1.0

* @created 24/7/2019 9:39:00 AM

public class Luggage extends Delivery {

	private static final String;
	// add attribute to store this passenger's luggage
	
	private static String[] LuggageList = {"Luggage"}; 
     // update list of luggage for travel.
	
	public docNumber(int _docNumber){
		super(_docNumber);
	}

	
	public int getdocNumber(){
		return Luggage.int;
	}
	
	private void assignDestination(){ // assign a destination 	for passenger's luggage.

	}

	public int collectLuggage(){
		return docNumber.int;
	}
	
	@Override 
	public boolean isValid() {// check if luggage is valid 	for right destination - must not be in 	unassignedLuggageList
	//loop through the unassignedLuggageList and find 	destination name, then return false, otherwise return 	true
		return true;
	}

	
	public String toString() {
		return "Luggage";
	}
	
}//end Luggage


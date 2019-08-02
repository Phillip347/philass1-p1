 
package ticketingManagementSystem;
 
/**

 * @author Phillip Leicester
 
 * @version 1.0
 
 * @created 14/7/2019 2:52:00 PM

private String carriageType;  // e.g. First Class or Economy
	private String carriageID; // e.g. A B C
	private int seatNumber;
	private boolean valid;
	
	public Carriage(String _carriageType, String _carriageID, 	int _seatNumber) {
		
		this.setcarriageType(_carriageType); // save 			carriage type for this train service
		this.setcarriageID(_carriageID); //letter of the 			alphabet
		this.setseatNumber(_seatNumber); // assign seat 			number for this train service 
		this.checkIsValid();
		
	}

	/*
	 * Validate if this carriage is permitted to be attached 	for this train service
	 */
	public abstract boolean isValid() ; // override this in 	each particular carriage type class
	
	/*
	 
	
	protected void checkIsValid() {  // valid carriage must 	be assigned to the correct train service list (carriage)
		if (this.isValid() && carriageID)
			setValid(true);
		else
			setValid(false);
			
	}
	
	protected void setValid (boolean swapCarriage) { // this 	might be overridden in sub classes for some types of 	carriages that need to be removed
		valid = swapCarriage;
	}
	
	private void setseatNumber(int _seatNumber) {
		this.seatNumber = _seatNumber;
		if (this.seatNumber not null) // check if seat 			number is available
			valid = false;
	}

	
	public String getcarriageType() {
		// get the type of carriage for this service
		return this.carriageType;
	}
	
	public int getseatNumber() {
		return this.seatNumber;
	}

	protected void assigncarriageID(String _carriageID) 
	{
		this.carriageID = _characterString;
	}
	
}


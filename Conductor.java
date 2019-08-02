package ticketingManagementSystem;
 
 
/**

 * @author Phillip Leicester

 * @version 1.0
 
 * @created 21/7/2019 11:12:32 AM

private String checkTicket;  // e.g. First Class or Economy
	private String carriageID; // e.g. A B C
	private int seatNumber;
	private boolean valid;
	private String voucher;	//e.g. hands out vouchers for 	buffet car meal times

	public Conductor(String _trainService, String 	_carriageID, int _seatNumber, String _voucher) {
		
		this.settrainService(_trainService); // save 			this train service that the conductor is on
		this.setcarriageID(_carriageID);
		this.setseatNumber(_seatNumber); // assign seat 			number for this train service 
		this.checkIsValid();
		this.setvoucher(voucherTime); //assign voucher for 			meal times
		
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
		if (this.seatNumber not null) // check if seat 	number is available
			valid = false;
	}

	private void setvoucher(String _voucherTime) {
		this.voucherTime = _voucherTime;
		if (this.voucherTime not null) // check if meal time 			is available
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



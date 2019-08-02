
package ticketingManagementSystem; 

/**

 * @author Phillip Leicester
 
 * @version 1.0
 
 * @created 13/7/2019 2:49:42 PM

public class Ticket extends Travel {

	private static final double INITREGFEE = 50.0;
	private int TicketID; // ticket number
	private static int nextTicketID = 0;

	
	public Ticket(String){
		super("Ticket", bookingType); // is ticket First 			Class or economy.
		this.bookingType = " ";
		this.bookingType = false;
	}

	public Ticket(String){
		super("Ticket", bookingType);
		this.bookingType = bookingType;
		this.bookingType = false;
	}
	
	public Ticket(String bookingType){
		super("Ticket", bookingType);
		this.seatNumber = _seatNumber;
	}
	
	
	@Override
	protected void checkTicketIsValid() { // override this 	from the Ticket class to validate travel type and seat 	number 
		super.setValid(true);
	}

	public double getticketFee(){
		double fee;
		fee = Ticket.INITREGFEE;
		if (this.booking() )  // get cost of booking
		 // add code to update ticket fee 
		return fee;
	}
	

	@Override
	public boolean isTicketValid() {
		// TODO complete the code here
		boolean result = false;
		return result;
	}
}//end Ticket

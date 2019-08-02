package ticketingManagementSystem; 
 
/**

 * @author Phillip Leicester
 
 * @version 1.0

 * @created 21/7/2019 10:46:10 AM

public class Sleeper extends Service {

	private static final double sleeperFee = 0.0;
	private int SleeperID; // compartment number
	private static int nextSleeperID = 0;

	
	public Sleeper(String){
		super("Sleeper", bookingType); // is sleeper a 			single or twinnette.
		this.bookingType = " ";
		this.bookingType = false;
	}

	public Sleeper(String){
		super("Sleeper", bookingType);
		this.bookingType = bookingType;
		this.bookingType = false;
	}
	
	private void assignSleeperID(){
		// sleeper ID for each ticket
		String numString ="";
		int num = Ticket.nextSleeperID++;  // get next 			available ticket sleeper purchase
		
	@Override
	protected void checkTicketIsValid() { // override this 	from the Sleeper class to check validation of purchase
		super.setValid(true);
	}

	public double getticketFee(){
		double fee;
		fee = Ticket.sleeperFee;
		if (this.booking() )  // add cost to ticket if 			sleeper required
		// add code to update ticket fee to add sleeper
		return fee;
	}
	

	@Override
	public boolean isValid() {
		// TODO complete the code here
		boolean result = false;
		return result;
	}
}//end Sleeper


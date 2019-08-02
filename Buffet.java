 package ticketingManagementSystem;
 
/**

 * @author Phillip Leicester
 
 * @version 1.0

 * @created 13/7/2019 6:21:04 PM

public class BuffetMenuClass {
	Scanner menu;
	boolean stillRunning;
	Menu s1, s2, s3; // for prototype selection 1, selection 	3 meals that are created by option 1 with course type not 	yet selected
	Course c1, c2, c3; // for prototype course 1, use 3 course 	menu objects for testing
	
	public BuffetMenuClass() {

		this.menu = new Scanner(Menu.in);
		stillRunning = true;		
	// in order to commence food menu program
		
	}

	// PURPOSE: To start the buffet menu running its pseudo-	infinite loop of showing the menu, getting passender's 	chosen selection 
	
	//   and dealing with the chosen option's task. 
		public void start()
		{
			int passengerChoice;
				
			
			while (stillRunning)
			{
				showBuffetMenu();
				choice = getPassengerSelection(0,10);
				if (choice == 0) stillRunning = false;
				processChoiceMainMenu(choice);
			}
			
		}
		
		// METHOD:  showBuffetMenu
		// PURPOSE: To present a menu/list of options the 		for the passenger.
		// PASSED:  nothing
		// RETURNS: nothing
		// EFFECTS: A list of options is displayed on the 		screen.
		/**
		 * A simple prototype buffet information system 			designed with a text based menu that provides a 			number of buffet choices as follows:
			1. Add a new meal order
			2. Create a course type offering
			3. Nominate chosen menu course
			4. Record chosen menu
			5. Passenger pays for meal
			6. Cost of meal
		 */
		public void showBuffetMenu()
		{
			System.out.println();	// ensure a break 			between previous output and food menu
			System.out.println("What would you like to 			order please?");
			System.out.println("1.  Add a new meal");
			System.out.println("2.  Create a meal course 	range to passenger");
			System.out.println("3.  Create a new meal course 	offering");
			System.out.println("4.  Record chosen menu");
			System.out.println("5.  Add cost of meal");
			System.out.println("0.  Exit Program");
		}

		// METHOD:  processChosenBuffetMenu
		// PURPOSE: To dispatch control to a relevant method 	which handles the passenger's selected choice.
		// PASSED:
		// selection - the menu option selected by the 	passenger.
		// RETURNS: nothing
		// EFFECT:  Menu process performed based on the 	passenger's selection. Invalid selection
		// will result in an error message being 		displayed to the screen.
		// NOTE: This method will invoke a range of other 	methods to actually achieve the passenger's selection.
		public void processChosenBuffetMenu(int choice)
		{
			switch (choice)
			{
				case 1:
					Selected Menu details = 	createNewMenu(); // menu option 1 create a new menu
					
				// save this selection in one of s1, s2 or 	s3 test meal selection objects in this class
					if (s1==null) s1 = details;
					else if (s2==null) s2 = details;
					else s3 = details;  // if this is 	used 	more than 3 times, it will always save the new 	selection to s3.
					break;
				case 2:
					registerBuffetCourse(); // menu 	option 2 register course offering to passenger
					break;
				case 3:
					Course c = createNewBuffetCourse(); 	// menu range option 3 create a new course selection
					saveCourse(c);
					break;
				case 4:
					recordPassengerCourse(); 
					// menu option 4 record passenger 		selected course
					// this will allow passenger to add 	one of the 3 test selections to an existing buffet course
					
					break;
				case 5:
					String mealCourseString = 	getDetailsOfmealCourse(); // menu option 3 list details of 	a meal course
					System.out.println(mealCourseString);
					break;
				case 6:
					createPassengerInvoice();// menu 	option 3 calculate and display meal invoice
					break;
				
				case 0:
					this.stillRunning = false;				// causes the main loop of program to end (i.e. 			process ends)
					break;
					
				default:
					System.out.println("Unexpected meal 	selection made. Doing nothing.");
					break;
			}
		}
			
		private void recordPassengerSelection() {
			// record a meal selection to a particular 			passenger
			// ask passenger for meal details and create a 		new menu range
			Meal a = this.createNewBuffetRange();
			// ask passenger for menu selection
			if (c1==null && c2==null && c3==null)
				System.out.println("No meal courses set 		up. Passenger must select first");
			else {
				if (c1!=null) 	System.out.println(c1.getAllMeals());
				if (c2!=null) 	System.out.println(c2.getAllMeals());
				if (c3!=null) 	System.out.println(c3.getAllMeals());
				String mealName = 	this.getAMultiWordString("Enter name of meal : ");
				if (mealName.contains("\n")) 	System.out.println("something not right ");
				Meals = this.findMeal(mealName);
				// then add the meal order selected by 		passenger
				if (s!=null)    { // check we have a 			valid non null meal object
					s.mealName(a);  // if the meal is 		deemed valid and permitted for selection, then 			associate 	this meal with the passenger
					System.out.println("Passenger " + 	s.toString());
				}
			}
		}

		private Buffet createNewBuffetRange() {
		// To change this ask buffet employee for Buffet 			range details
		Buffet m = new order("Lunch","Fish with side salad", 		3); // hardcode 	meal order
			return b;
		}

		private void savemealCourse(Course c) {
			if (c1==null) 
				c1=c;
			else if (c2==null)
				c2=c;
			else c3=c; // always save meal course in c3 if 			other meal objects c1,c2 are already to be				created
			
		}

		private String createCostofMeal() {
			String cost="";
			// generate payment cost for meal
			if (s1!=null) {
				cost += s1.generateRegistrationInvoice();
			}
			if (s2!=null) {
				cost += s2.generateRegistrationInvoice();
			}
			if (s3!=null) {
				cost += s3.generateRegistrationInvoice();
			}
			
			
			return cost;
		}


		private Voucher createmealTime() {
			// create voucher times for meals in buffet 			car
			Voucher s;
			String sbreakfast, slunch, sdinner, smealTime;
						
			sname = this.getAMultiwordString("Please enter 			meal Type: ");
			smealTime = this.getAMultiwordString("Please 			enter meal time: <nn meal time>");
			s = new Voucher(sbreakfast, slunch, sdinner);
			
			//debug messsage
			System.out.println("just created voucher for " 			+ s.toString());
			return s;
		}
		

		private boolean getABoolean(String _prompt) {
			String ans = this.getAString(_prompt);
			if ((ans.contains("Y")) || 						(ans.contains("y")))
					return true;
			else
					return false;
		}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BuffetMenuClass m = new BuffetMenuClass();
		m.start();
	}

}


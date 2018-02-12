
public class ticketType {
	int Price;
	String name;
	
	
	
	public ticketType(String name) {
	this.name = name;
	}
	
	public void ticketPrice(int ticketPrice) {
	ticketPrice = Price;
	}
	
static ticketType ticketOne = new ticketType("Adult");
static ticketType ticketTwo = new ticketType("Child");
static ticketType ticketThree = new ticketType("Student");
static ticketType ticketFour = new ticketType("OAP"); {

ticketOne.ticketPrice(8);
ticketTwo.ticketPrice(4);
ticketThree.ticketPrice(6);
ticketFour.ticketPrice(6);

}

	



	
	
	
	

}

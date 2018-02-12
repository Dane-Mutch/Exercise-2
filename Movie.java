import java.util.Scanner;
import java.io.*;


public class MovieSelect {
	//1) get name
	//2) get movie
	//3) select viewing time
	//3) get number of seats
	//4) get ticket types
	//5) select seat location
	//6) print out
	
	static Scanner scan = new Scanner(System.in);
	static String name;
	static String[] movielist = {"1) Fight Club","2) Snatch","3) Scary Movie","4) Gladiator"};
	static String[] viewingtimelist = {"1) 1.00PM","2) 3.00PM","3) 5.00PM","4) 7.00PM","5) 9.00PM"};
	static int[] nooftickets = {0,1,2,3,4,5};
	
	

	public static void getName() {
		System.out.println("Please insert your name");
	}
	
	public static void getMovie() {
		System.out.println("Please select movie");
		for(int i=0;i<movielist.length;i++) {
		System.out.println(movielist[i]);
		}
		int number=scan.nextInt();
		System.out.println("You Selected "+movielist[number-1].substring(3, movielist[number].length()));
		getViewingTime();
	
	}
	
	public static void getViewingTime() {
		System.out.println("Please select a viewing time");
		for(int i=0;i<viewingtimelist.length;i++) {
		System.out.println(viewingtimelist[i]);
			}
		int number=scan.nextInt();
		System.out.println("You Selected "+viewingtimelist[number-1].substring(3, viewingtimelist[number].length()));
		getAdultTicket();
	
	}
	

	public static void getAdultTicket() {
		System.out.println("Please select number of adult tickets");
		for(int i=0;i<nooftickets.length;i++) {
			System.out.println(nooftickets[i]);
				}
			int number=scan.nextInt();
			System.out.println("You Selected "+nooftickets[number-1]" adult tickets"")
			getChildTicket;
			
	}
			
	public static void getChildTicket() {
		System.out.println("Please select number of child tickets");
		for(int l=0;l<nooftickets.length;l++) {
			System.out.println(nooftickets[l]);
				}
			int number=scan.nextInt();
			System.out.println(("You Selected "+nooftickets[number-1]" child tickets"")
			getOAPTicket;
			
	}
	
	public static void getOAPTicket() {
		System.out.println("Please select number of OAP tickets");
		for(int k=0;k<nooftickets.length;k++) {
			System.out.println(nooftickets[k]);
				}
			int number=scan.nextInt();
			System.out.println("You Selected "+nooftickets[number-1]" OAP tickets"")
			getStudentTicket;
			
	}
	
	public void getStudentTicket() {
		System.out.println("Please select number of student tickets");
		for(int j=0;j<nooftickets.length;j++) {
			System.out.println(nooftickets[j]);
				}
			int number=scan.nextInt();
			System.out.println("You Selected "+nooftickets["number-1";]" student tickets");
			getTotalPrice;
	}


	public static void getTotalPrice() {
		int number= (i * ticketType.ticketOne)+(l * ticketType.ticketTwo)+(k * ticketType.ticketThree)+(j * ticketType.ticketFour);
		System.out.println("The total cost of your tickets is [number] pounds.");
	
	}



	
	
	public static void main(String[] args){
		getName();
	}
	
}
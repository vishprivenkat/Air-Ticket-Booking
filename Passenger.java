

import java.util.*;


public class Passenger extends Person
{	
	private int passportNo;
	private int accountNo;
	private int age;
	public static String itenaryNo="1226463";
	public static int digiCode=0;
	//constructor for getting passenger details
	public Passenger()
	{	Scanner ip= new Scanner(System.in);


		System.out.println("Enter your age:");
		age=ip.nextInt();
		System.out.println("Enter your Passport Number:");
		passportNo=ip.nextInt();
		System.out.println("Enter your Account Number:");
		accountNo=ip.nextInt();


	}

	//for incrementing the digiCode that is unique for every itenary
	public static void itenaryNumPrint()
	{	digiCode++;
		System.out.println(itenaryNo+digiCode);
	}

	// for displaying passenger details
	@Override
	public void display()
	{	super.display();
		System.out.println("Passenger Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Passport Number: "+passportNo);
		System.out.println("Account Number: "+accountNo);
	}

	// main implementation of the application starts here
	public static void main(String [] args)
	{	Scanner input= new Scanner(System.in);
		Passenger P1= new Passenger();
		AirTicket A1= new AirTicket();
		String option;
		A1.priceCal();
		System.out.println("Do you want to Cancel the ticket you have booked(yes/no):");
		option= input.nextLine();
		if( option== "yes")
		{	A1.cancellation();
			System.out.println("We thank you for using our services. Do visit again. Until then, ciao!");
			return;
		}

		System.out.println("Itenary number:");
		itenaryNumPrint();
		P1.display();
		A1.dispDetails();
		System.out.println("Bon Voyage! Thank you for choosing our services.");
	}
}

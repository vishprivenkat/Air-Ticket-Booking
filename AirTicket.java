

import java.util.Scanner;
import java.util.Date;

public class AirTicket
{
  double price;
  String destination, origin;
  Date dateOfTravel, dateOfBooking;
  String travelClass;

  AirTicket()
  {
      Scanner input= new Scanner(System.in);
      Scanner ip= new Scanner(System.in);
      System.out.println("Enter the place of origin:");
      origin= input.nextLine();
      System.out.println("Enter the Destination:");
      destination= ip.nextLine();
      int d,m,y;
      System.out.println("Enter the date of travel:");
      d= input.nextInt();
      m= input.nextInt();
      y=ip.nextInt();
      dateOfTravel= new Date(y,m,d);
      dateOfBooking= new Date();
      System.out.println("Enter Travel Class: (Economy/ Executive)  ");
      travelClass= ip.nextLine();

    }

    void priceCal()
    {
      if( dateOfBooking.compareTo(dateOfTravel)==0)
          price= 5.6*10000;
      else
          price= 3.4*10000;

      if( travelClass=="Economy")
        price+= 1000.0;
      else
        price+=6788.0;
    }

    void cancellation()
    {
        if(dateOfBooking.compareTo(dateOfTravel)==0)
          System.out.println("Amount paid: "+price+"\nAmount Refunded: "+(price - 0.1*price));
        else
          System.out.println("Amount paid: "+price+"\nAmount Refunded: "+(price - 0.01*price));
    }

    void dispDetails()
    {
      System.out.println("Starting Point: "+origin);
      System.out.println("Destination :"+ destination);
      System.out.println("Date of Travel: "+ dateOfTravel);
      System.out.println("Date of Booking: "+ dateOfBooking);
      System.out.println("Travel Class: "+ travelClass);
      System.out.println("Price of Ticket: "+ price);
    }
}

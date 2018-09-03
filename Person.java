
import java.util.Date;
import java.util.Scanner;
public class Person {

  protected   String name;
  protected  int aadharID;
  protected  int houseNumber;
  protected  String streetName, areaName, city, nationality;
  protected  int postCode;
  protected int phoneNumber;
  protected  Date DOB;

    public Person() {
        int d,m ,y;
        Scanner input = new Scanner(System.in);
        Scanner ip= new Scanner(System.in);
        System.out.print("Enter Your Name:");
        name = input.nextLine();
        System.out.print("Enter Your Aadhar:");
        aadharID=input.nextInt();
        System.out.println("Enter Address Details:");
        System.out.print("\tEnter your House Number:");
        houseNumber= input.nextInt();
        System.out.print("\tEnter Street Name:");
        streetName=ip.nextLine();
        System.out.print("\tEnter Area Name:");
        areaName= ip.nextLine();
        System.out.print("\tEnter Post Code of the Area:");
        postCode=input.nextInt();
        System.out.print("\tEnter City Name:");
        city=ip.nextLine();
        System.out.print("Enter Phone Number:");
        phoneNumber= input.nextInt();
        System.out.print("Enter Nationality:");
        nationality=ip.nextLine();
        System.out.println("Enter Date of Birth:");
        d=input.nextInt();
        m=input.nextInt();
        y=input.nextInt();
        DOB= new Date(y,m,d);
       }
        public void display()
        {
            System.out.println("Name :"+name);
            System.out.println("Aadhar ID:"+aadharID);
            System.out.println("Address: "+houseNumber+","+streetName+" street ");
            System.out.print(areaName+","+city+" "+postCode);
            System.out.println("Nationality:"+ nationality);
            System.out.println("Date Of Birth:"+ DOB.toString());

        }


}

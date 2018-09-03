# Air-Ticket-Booking
a simple java application that carries out the operations for booking an airline ticket

The main class in Passenger which extends the class Person.
It also Uses the class AirTicket for performing the necessary operations.

class Person 
Person()- The default constructor is used for getting basic information about the passesnger such as nams, address and other details
display()- This function is used for displaying details of class Person.

class Passenger
- It extends class Person
Passenger()- The default constructor is used for getting details like Passport number etc. 
display()- This function overrides the super class function, though an internal call to the super class display function is also made
itenaryNumPrint()- This function is used for printing the static private member itenaryNo while displaying the travel details

class AirTicket
AirTicket()- The default constructor is used for getting travel details like, destination, dateOfTravel etc.
priceCal()- This function is used for calculating the price for the journey, depending on the class of Travel(economy/ executive)
cancellation()- This function is used for returning the amount that will be refunded depending on the date of cancellation and date of travel
dispDetails()- details help in the private instances of the class AirTicket are displayed using this function.

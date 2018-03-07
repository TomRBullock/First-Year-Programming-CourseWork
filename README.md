# First-Year-Programming-CourseWork
Simple java project from university coursework

The project was to create an Airline system that used techniques learnt from out programming module.

This project uses Object Oriented Programming: 
      * Encapsulation
      * Abstraction
      * Inheritance
      * Polymorphism
      
   
The idea behind my solution was that there were two entities: an Aircraft or a Passenger. 

An Aricraft implements Route, which stores hard values for flights. There are no child classes of Aircraft

A Passenger is either a PayingPassenger or a Crew member. Passenger implements the Weight interface as all passengers have a weight to them.

A PayingPassenger implements Chargable. PayingPassenger is split further in to either FirstClassPassenger or EconomyPassenger, each having their own charge rates.

BookingAdmin uses input dialog boxes to allow a user to create aircrafts and add passengers.

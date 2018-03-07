import java.util.ArrayList;
/**
 * Write a description of class PassengerTest here.
 * 
 */
public class PassengerTest
{
   
    
    /**
     * Constructor for objects of class PassengerTest
     */
    public static void PassengerTest()
    {       
       
       Aircraft A1 = new Aircraft(Route.CAPE_TOWN, Route.CAPE_TOWN_MAX_PASSENGERS, Route.CAPE_TOWN_MAXIMUM_WEIGHT);
       EconomyPassenger ECON1 = new EconomyPassenger("Abdul", "dumb", 100, 10, Economy.CAPETOWN_BASE_FARE,"QJ1234");
       EconomyPassenger ECON2 = new EconomyPassenger("Abdul", "Stupid", 100, 10, Economy.CAPETOWN_BASE_FARE,"QJ1235");
       Crew CRW1 = new Crew(Crew.CAPTAIN, "John", "Smith", 100, 10);
       Crew CRW2 = new Crew(Crew.CABINCREW, "John", "Smith", 100, 10);
       EconomyPassenger ECON3 = new EconomyPassenger("Abdul", "Thick", 100, 10, Economy.CAPETOWN_BASE_FARE,"QJ1236");
       
       
       System.out.println(A1.addPassenger(ECON1));
       A1.addPassenger(ECON2);
       
       A1.addPassenger(CRW1);
       A1.addPassenger(CRW2);
       A1.addPassenger(ECON3);
       
       System.out.println(A1.findPassenger(1001));
       System.out.println();
       A1.listPassengers();
       System.out.println();
       A1.listPayingPassengers();
       System.out.println();
       
       A1.removePassenger(1001);
       A1.removePassenger(1004);
       
       System.out.println();
       A1.listPassengers();
       System.out.println();
       A1.listPayingPassengers();
       System.out.println();
       System.out.println(A1.findPassenger(1000));
       System.out.println(A1.toString());
       
       System.out.println();
       
       
       
    }
}

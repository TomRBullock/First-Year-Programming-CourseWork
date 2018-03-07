
/**
 * Write a description of class AircraftFunctionTester here.
 * 
 */
public class AircraftFunctionTester
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class AircraftFunctionTester
     */
    public static void AircraftFunctionTester()
    {
        //create and aircraft to glasgow
        Aircraft glasgowRouteAircraft = new Aircraft(Route.GLASGOW, Route.GLASGOW_MAX_PASSENGERS, Route.GLASGOW_MAXIMUM_WEIGHT);
        //print out the details of the flight
        System.out.println(glasgowRouteAircraft.toString());
        //Add a Captain
        Crew captain = new Crew(Crew.CAPTAIN, "John", "Smith", 85, 10);
        System.out.println(glasgowRouteAircraft.addPassenger(captain));
        
        System.out.println();
        
        //Add passengers to test max weight and max passengers
        for(int c = 0; c< 120; c++){
                    String pfn = c+"FName";
                    String pln = c+"LName";
                    String FFC = "QJ" + c;
                    EconomyPassenger ep = new EconomyPassenger(pfn, pln,75,15, Economy.GLASGOW_BASE_FARE,FFC);
                    //Will Print false if passenger cannot be added
                    System.out.print(glasgowRouteAircraft.addPassenger(ep));
                    System.out.println("  " + c);
               }
        
        System.out.println();       
               
        //testing the method that finds passengers       
        System.out.println(glasgowRouteAircraft.findPassenger(1013));
        System.out.println(glasgowRouteAircraft.findPassenger(1100));
        System.out.println(glasgowRouteAircraft.findPassenger(1407));
        System.out.println(glasgowRouteAircraft.findPassenger(0));
        
        System.out.println();
        
        //Print out all passengers on the aircraft
        glasgowRouteAircraft.listPassengers();
        
        System.out.println();
        
        //remove a passenger, and prove successful
        System.out.println(glasgowRouteAircraft.findPassenger(1025));
        glasgowRouteAircraft.removePassenger(1025);
        System.out.println(glasgowRouteAircraft.findPassenger(1025));
    }
}


/**
 * Write a description of class Crew here.
 * 
 */
public class Crew extends Passenger
{
    // instance variables - replace the example below with your own
    private String Type;
    public static final String CAPTAIN = "Captain";
    public static final String FIRSTOFFICER = "First Officer";
    public static final String CABINCREW = "Cabin Crew";
    
    //Crew crew1 = new Crew ( thomas , bullock , 90, 20 , Crew.CAPTAIN)
    /**
     * Constructor for objects of class Crew
     */
    public Crew(String Type, 
                String FirstName,
                String LastName, 
                double Weight, 
                double Luggage)
    {
        super(  0,
                FirstName, 
                LastName, 
                Weight,
                Luggage);
        this.Type = Type;
    }

    public String getType(){
        return this.Type;
    }
    
    public String toString(){
        return super.toString() + ". Type : " + getType();
    }

}

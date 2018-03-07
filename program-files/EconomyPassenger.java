
/**
 * Write a description of class EconomyPassenger here.
 * 
 */
public class EconomyPassenger extends PayingPassenger implements Economy
{
    // instance variables - replace the example below with your own
    private String Type;

    /**
     * Constructor for objects of class EconomyPassenger
     */
    public EconomyPassenger(String FirstName,
                            String LastName,
                            double Weight,
                            double Luggage,
                            int BaseFare,
                            String FFC)
    {
        super(  Economy.START_NUMBER, 
                FirstName, 
                LastName, 
                Weight, 
                Luggage,   
                Economy.TYPE_CHARGE,
                BaseFare,
                FFC);
        this.Type = "Economy";
    }
    
    public String getType(){
        return this.Type;
    }
    
    public String toString(){
        return super.toString() + ". This is an " + getType() + " Passenger";
    }
}


/**
 * Write a description of class FirstClassPassenger here.
 * 
 */
public class FirstClassPassenger extends PayingPassenger implements FirstClass
{
    // instance variables - replace the example below with your own
    private String Type;
    private double additionalLuggage;

    /**
     * Constructor for objects of class EconomyPassenger
     */
    public FirstClassPassenger(String FirstName,
                            String LastName,
                            double Weight,
                            double Luggage,
                            int BaseFare,
                            String FFC)
    {
        super(  FirstClass.START_NUMBER, 
                FirstName, 
                LastName, 
                Weight, 
                Luggage,   
                FirstClass.TYPE_CHARGE,
                BaseFare,
                FFC);
        this.Type = "First Class";
        this.additionalLuggage = 0;
    }
    
    public double getWeight(){
        return super.getWeight() + this.additionalLuggage;
    }
    
    public double getAdditionalLuggage(){
        return this.additionalLuggage;
    }
    
    public void setAdditionalLuggage(double AdditionalLuggage){
        this.additionalLuggage = AdditionalLuggage;
    }
    
    public String getType(){
        return this.Type;
    }
    
    public String toString(){
        return super.toString() + ". This is an " + getType() + " Passenger";
    }
    
}

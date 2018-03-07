
/**
 * Class Passenger
 * 
 */
public abstract class Passenger implements Weighable
{
    // instance variables - replace the example below with your own
    private final int PassengerNumber;
    private final String FirstName;
    private final String LastName;
    private double Weight;
    private double Luggage;
    public static int ID_SEQUENCE = 0;

    /**
     * Constructor for objects of class Passenger
     */
    public Passenger(   int PassengerNumberStart, 
						String FirstName, 
						String LastName,
						double Weight, 
						double Luggage)
    {
       this.PassengerNumber = PassengerNumberStart + Passenger.ID_SEQUENCE;
       Passenger.ID_SEQUENCE ++;
       this.FirstName = FirstName;
       this.LastName = LastName;
       this.Weight = Weight;
       this.Luggage = Luggage;
       
    }
    
    public int getPassengerNumber(){
        return this.PassengerNumber;
    }
    
    public String getFirstName(){
        return this.FirstName;
    }
   
    public String getLastName(){
        return this.LastName;
    }
    
    public double getWeight(){
        return this.Weight + this.Luggage;
    }
       
    public void setWeight(double Weight){
        this.Weight = Weight;
    }
    
    public void setLuggage(double Luggage){
        this.Luggage = Luggage;
    }
    
    public String toString(){
		String name = getFirstName() + " " + getLastName();
		String Message = "ID of passenger : " + getPassengerNumber() 
						+ ". Passenger Name : " +name + ". Total Weight : " + getWeight(); 
        return Message;
    }
}

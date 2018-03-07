
/**
 * Class PayingPassenger is a subclass of Passenger.
 * It is used for any passenger that has to pay, so not including crew members.
 * But it is the parent class of Economy because PayingPassenger holds the 
 * default methods for all paying passengers, so including any first class or buisness class 
 * passengers if they exist.
 * 
 */
public abstract class PayingPassenger extends Passenger implements Chargeable
{
    // instance variables - replace the example below with your own
    private int BaseFare;
    private int TypeCharge;
    private final String FFC;
    

    /**
     * Constructor for objects of class PayingPassenger
     * 
     * Create a new Paying Passenger, taking a StartNumber to differentiate the type of 
     * passenger as well as the base fare and the type charge.
     *
     *@param  PassengerNumberStart  The number at which the passenger id number should start
     *@param  FirstName  The first name of the passenger
     *@param  LastName  The surname of the passenger
     *@param  Weight  The weight of the passenger
     *@param  Luggage  The weight of the passenger's luggage
     *@param  TypeCharge  The type charge that the passenger recieves
     *@param  BaseFare  The base fare of the certain flight the passenger is on
     *
     *
     */
    public PayingPassenger( int PassengerNumberStart, 
                            String FirstName, 
                            String LastName,
                            double Weight,
                            double Luggage,
                            int TypeCharge,
                            int BaseFare,
                            String FFC)
    {
        super(  PassengerNumberStart, 
                FirstName, 
                LastName, 
                Weight, 
                Luggage);
        this.BaseFare = BaseFare;
        this.TypeCharge = TypeCharge;
        this.FFC = FFC;
    }
    
    /**
     * The fare a passenger is charged based on their weight, base fare and typecharge.
     * 
     * @return  A double value based on a calculation of the passengers total weight 
     * times by the type charge, then added to the base fare. 
     */
    public double getCharge(){
        return (this.BaseFare + ((super.getWeight()) * this.TypeCharge));
    }
    
    /**
     * Get the Charge Type for this passenger
     * 
     * @return  An integer value, where the value returned is the TypeCharge variable owned by the class instance
     */
    public int getTypeCharge(){
        return this.TypeCharge;
    }
    
    public String getFFC(){
        return this.FFC;
    }
    
    /**
     * A toString to output the passengers previous information and the total fare that the passenger has to pay
     * 
     * @return   A series of text strings with a following getter statement which collects the relative information.
     * In this class' toString the getCharge is called to show the passengers fare.
     */
    public String toString(){
        return super.toString() + ". Passenger Fare = " + getCharge() + ". Passengers Frequent Flyer Code is " + getFFC();
    }
}

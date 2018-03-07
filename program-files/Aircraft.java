import java.util.ArrayList;

/**
 * Write a description of class Aircraft here.
 *
 */
public class Aircraft implements Route
{
    // instance variables - replace the example below with your own
    private double totalWeight;
    private double revenue;
    private int maxPassengers;
    private double maxWeight;
    private String route;
    private int passengers;
    private ArrayList<Passenger> passengerList;
    private ArrayList<PayingPassenger> payingPassengerList;

    /**
     * Constructor for objects of class A5164ircraft
     */  
    public Aircraft(String route,
                    int maxPassengers,
                    double maxWeight
                    )
    {
       
       this.maxPassengers = maxPassengers;
       this.maxWeight = maxWeight;
       this.route = route;
       
       passengerList = new ArrayList<Passenger>(); 
       payingPassengerList = new ArrayList<PayingPassenger>();
    }

    public void listPassengers(){
        for(Passenger passenger : passengerList){
           System.out.println(passenger.toString());
        }     
    }
    
    public void listPayingPassengers(){
        for(PayingPassenger passenger : payingPassengerList){
           System.out.println(passenger.toString());
        }     
    }
    
    public void showFirstClass(){
        for(PayingPassenger passenger : payingPassengerList){
            if (passenger instanceof FirstClassPassenger){
                System.out.println(passenger.toString());
            }
        }     
    }
    
    public boolean addPassenger(Passenger newPassenger){
        double newWeight = (this.totalWeight + newPassenger.getWeight());
        int newPassengerTotal = (this.passengers ++);
        if ((newWeight <= this.maxWeight) && (newPassengerTotal <= this.maxPassengers)){
            passengerList.add(newPassenger);
            this.passengers = newPassengerTotal;
            this.totalWeight = newWeight;
            return true;
        } 
        else {
            //System.out.println("Passenger " + newPassenger.getPassengerNumber() + " cannot be added");
            return false;
        }
    }
    
    public boolean addPassenger(PayingPassenger newPassenger){
        double newWeight = (this.totalWeight + newPassenger.getWeight());
        int newPassengerTotal = (this.passengers ++);
        if ((newWeight <= this.maxWeight) && (newPassengerTotal <= this.maxPassengers)){
            passengerList.add(newPassenger);
            payingPassengerList.add(newPassenger);
            this.passengers = newPassengerTotal;
            this.totalWeight = newWeight;
            return true;
        } 
        else {
            //System.out.println("Passenger " + newPassenger.getPassengerNumber() + " cannot be added");
            return false;
        }
    }
    
    public String findPassenger(int passengerNumber){
        for(Passenger passenger : passengerList){
            if (passengerNumber == passenger.getPassengerNumber()){
                return passenger.toString();
            }
        }
        return "Passenger not found";
    }
    
     public boolean removePassenger(int passengerNumber)
    {
        
        for(int i = 0; i < passengerList.size(); i++){        
            Passenger currentPassenger = passengerList.get(i);
            if(passengerNumber == currentPassenger.getPassengerNumber())
            {
                passengerList.remove(i);
                break;
            }           
        }
       
        for(int i = 0; i < payingPassengerList.size(); i++){
            PayingPassenger currentPassenger = payingPassengerList.get(i);
            if(passengerNumber == currentPassenger.getPassengerNumber())
            {
                payingPassengerList.remove(i);
                return true;
            }            
        }
        return false;
    }
        
    public double getTotalWeight(){
        return this.totalWeight;
    }
    
    public int getTotalPassengers(){
        return this.passengers;
    }
    
    public String getRoute(){
        return this.route;
    }
    
    public void setMaxWeight( double maxWeight)
    {
        this.maxWeight = maxWeight;
    }
    
    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }
    
    public double getRevenue(){
        double revenue = 0;
        for(PayingPassenger passenger : payingPassengerList){
            revenue = revenue + passenger.getCharge();
        }
        return revenue;
    }
    
     public void setRoute(String route)
    {
        this.route = route;
    }
    
    
    public String toString(){
        return "Route to " + getRoute() + ". Total passengers is " + getTotalPassengers() 
        + ". Total weight is " + getTotalWeight() + ". Total revenue is " + getRevenue();
    }
}

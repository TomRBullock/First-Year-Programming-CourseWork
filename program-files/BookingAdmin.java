import javax.swing.*;
import java.util.ArrayList;
/**
 * Write a description of class BookingAdmin here.
 * 
 */
public class BookingAdmin
{
    private static Aircraft aircraft = new Aircraft(Route.GLASGOW, Route.GLASGOW_MAX_PASSENGERS, Route.GLASGOW_MAXIMUM_WEIGHT);
    
    public static String InputDialog(String [] list, String message){
        String showList = (String) JOptionPane.showInputDialog(null, message, "Choose an option", JOptionPane.PLAIN_MESSAGE, null, list, list[0]);
        return showList;
    }
    
    public static void main(String[] args){
        BookingAdmin user = new BookingAdmin();
        user.menu();
    }
    
    
    public void menu(){
        String [] choiceList = new  String[3];
        choiceList[0] = "Edit Aircraft or Add Passengers";
        choiceList[1] = "Show airplane information";
        choiceList[2] = "Exit";
        boolean cont = true;
        while(cont == true)        
        {
            String choice = InputDialog(choiceList, "Choose an option");
            if (choice.equals(choiceList[0]))
            {
                setupAdmin();
            }
            else if (choice.equals(choiceList[1]))
            {
                showInfo();
            }
            else if (choice.equals(choiceList[2]))
            {
                System.out.println("Exiting System");
                cont = false;
            }
        }
    }
    
    
    private void setupAdmin(){
       boolean cont = true;
       String [] choiceList = new  String[3];
       choiceList[0] = "Edit Aircraft";
       choiceList[1] = "Add Passenger to exiting aircraft";
       choiceList[2] = "return";
       while(cont == true )
        {           
           String choice = InputDialog(choiceList, "Choose an option");
           if (choice.equals(choiceList[0])){
               editAircraft();
           }   
           else if (choice.equals(choiceList[1])){
               addPassengers(); 
           }
           else if (choice.equals(choiceList[2])){
               menu();
               cont = false;
           }
           else {
               System.out.println("Sorry, you didn't select and option. Try again");
           } 
       } 
    }
    
    public void editAircraft(){
        boolean cont = true;
        String [] aircraftChoiceList = new  String[3];
        aircraftChoiceList[0] = "Glasgow";
        aircraftChoiceList[1] = "Cape Town";
        aircraftChoiceList[2] = "return";
        while(cont == true){
            String choice = InputDialog(aircraftChoiceList, "Choose an option");
            if (choice.equals(aircraftChoiceList[0])){
                aircraft.setRoute(Route.GLASGOW);
                aircraft.setMaxPassengers(Route.GLASGOW_MAX_PASSENGERS);
                aircraft.setMaxWeight(Route.GLASGOW_MAXIMUM_WEIGHT);
                cont = false;
            }   
            else if (choice.equals(aircraftChoiceList[1])){
                aircraft.setRoute(Route.CAPE_TOWN);
                aircraft.setMaxPassengers(Route.CAPE_TOWN_MAX_PASSENGERS);
                aircraft.setMaxWeight(Route.CAPE_TOWN_MAXIMUM_WEIGHT);
                cont = false;
            }
            else if (choice.equals(aircraftChoiceList[2])){
                System.out.println("Returning to previous selection");
                setupAdmin();
                cont = false;
            }
            else {
                System.out.println("Sorry, you didn't select and option. Try again");
            } 
        }
    }
    
    public String FirstName(){
        String firstname = JOptionPane.showInputDialog("Please, Enter the Passengers First Name.");
        return firstname;
    }
    
    public String LastName(){
        String lastname = JOptionPane.showInputDialog("Please, Enter the Passengers Last Name.");
        return lastname;
    }
    
    public double Luggage(){
        String enterluggage = JOptionPane.showInputDialog("Please, Enter the Passengers Luggage Weight.");
        double luggage = Double.parseDouble(enterluggage);
        return luggage;
    }
    
    public double Weight(){
        String enterweight = JOptionPane.showInputDialog("Please, Enter the Passengers Weight.");
        double weight = Double.parseDouble(enterweight);
        return weight;
    }
    
    public String setFFC(){
        String enterFFC = JOptionPane.showInputDialog("Please, Enter the Passengers Frequent Flyer Code.");
        return enterFFC;
    }
    
    public String crewPosition(){
        String [] position = new String[3];
        position[0] = "Captain";
        position[1] = "First Officer";
        position[2] = "Cabin Crew";
        
        boolean cont = true;
         while(cont == true){
            String choice = InputDialog(position, "Choose an option");
            if(choice.equals(position[0]))
            {
                return "Captain";
            }
            else if(choice.equals(position[1]))
            {
                return "First Officer";
            }
            else if(choice.equals(position[2]))
            {
                return "Cabin Crew";
            }
            else
            {
                System.out.println("Sorry, you didn't select and option. Try again");
            }
            cont = true;
        }
        
        return null;
    }
    
    public int getBaseFareEconomy(){
        String route = aircraft.getRoute();
        if((route.equalsIgnoreCase("Glasgow")) )
        {
            return Economy.GLASGOW_BASE_FARE;
        }
        else if(route.equalsIgnoreCase("Cape Town"))
        {
            return Economy.CAPETOWN_BASE_FARE;
        }
        return Economy.GLASGOW_BASE_FARE;
    }
    
    public int getBaseFareFirstClass(){
        String route = aircraft.getRoute();
        if((route.equalsIgnoreCase("Glasgow")) )
        {
            return FirstClass.GLASGOW_BASE_FARE;
        }
        else if(route.equalsIgnoreCase("Cape Town"))
        {
            return FirstClass.CAPETOWN_BASE_FARE;
        }
        return FirstClass.GLASGOW_BASE_FARE;
    }
    
    public boolean addPassenger(){
        Passenger newCrewMember = new Crew(crewPosition(), FirstName(), LastName(), Weight(), Luggage());
        aircraft.addPassenger(newCrewMember);
        System.out.println(newCrewMember);
        return true;
    }
    
    public boolean addEconomyPassenger(){
        PayingPassenger newPassenger = new EconomyPassenger(FirstName(), LastName(), Weight(), Luggage(), getBaseFareEconomy(),setFFC());
        aircraft.addPassenger(newPassenger);
        System.out.println(newPassenger);
        return true;
    }
    
    public boolean addFirstClassPassenger(){
        PayingPassenger newPassenger = new FirstClassPassenger(FirstName(), LastName(), Weight(), Luggage(), getBaseFareFirstClass(),setFFC());
        aircraft.addPassenger(newPassenger);
        System.out.println(newPassenger);
        return true;
    }
    
    public void addPassengers(){
        String [] addPassengers = new String[5];
        addPassengers[0] = "Add Economy passenger";
        addPassengers[1] = "Add First Class passenger";
        addPassengers[2] = "Add crew member";
        addPassengers[3] = "Return";
        addPassengers[4] = "Auto Fill plane";
        boolean cont = true;
        while(cont == true){
            String choice = InputDialog(addPassengers, "Choose an option");
            if (choice.equals(addPassengers[0])){
                addEconomyPassenger();  
            }   
            else if (choice.equals(addPassengers[1])){
                addFirstClassPassenger();
            }
            else if (choice.equals(addPassengers[2])){
                addPassenger();                
            }
            else if (choice.equals(addPassengers[3])){
                System.out.println("Returning to previous selection");
                setupAdmin();
                cont = false;
            }
            else if (choice.equals(addPassengers[4])){
                for(int c = 0; c< 100; c++){
                    String pfn = c+"FName";
                    String pln = c+"LName";
                    String FFC = "QJ" + c;
                    EconomyPassenger ep = new EconomyPassenger(pfn, pln,75,15, Economy.GLASGOW_BASE_FARE,FFC);
                    aircraft.addPassenger(ep);
               }
            }
            else {
                System.out.println("Sorry, you didn't select and option. Try again");
            } 
            cont = false;
        }
    }
    
    
    public void showInfo(){
       boolean cont = true;
       String [] choiceList = new  String[5];
       choiceList[0] = "Show All Passengers";
       choiceList[1] = "Show First Class Passengers";
       choiceList[2] = "Show Current Revenue";
       choiceList[3] = "Show Current Weight";
       choiceList[4] = "Return";
       while(cont == true )
        {           
           String choice = InputDialog(choiceList, "Choose an option");
           if (choice.equals(choiceList[0])){
               aircraft.listPassengers();
           }   
           else if (choice.equals(choiceList[1])){
               aircraft.showFirstClass();
            }
           else if (choice.equals(choiceList[2])){
               System.out.println("The current revenue for this aircraft is " + aircraft.getRevenue());
           }
           else if (choice.equals(choiceList[3])){
               System.out.println("The current Weigth for this aircraft is " + aircraft.getTotalWeight());
           }
           else if (choice.equals(choiceList[4])){
               menu();
               cont = false;
           }
           else {
               System.out.println("Sorry, you didn't select and option. Try again");
           } 
       } 
    }
    
}

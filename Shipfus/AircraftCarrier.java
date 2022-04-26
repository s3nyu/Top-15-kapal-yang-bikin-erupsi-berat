package Learn.Shipfus;

public class AircraftCarrier extends Ship{
    String type = "Aircraft Carrier";

    AircraftCarrier(String name, String rarity, String ID){
        super(name,rarity,ID);
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Type : " + type);
        System.out.println("Rarity : " + rarity);
        System.out.println("ID : " + ID);
        System.out.println(" ");
    }
    
}

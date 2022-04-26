package Learn.AzurLane;

public class Ship {

    public String name;
    public String rarity;
    public String ID;

    Ship(String name, String rarity, String ID){
        this.name = name;
        this.rarity = rarity;
        this.ID = ID;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Rarity : " + rarity);
        System.out.println("ID : " + ID);
        System.out.println(" ");
    }
    
}

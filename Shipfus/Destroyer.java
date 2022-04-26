package Learn.AzurLane;

public class Destroyer extends Ship{
    String type = "Destroyer";
    
    Destroyer(String name, String rarity, String ID){
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

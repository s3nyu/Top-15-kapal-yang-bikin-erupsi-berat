package Learn.AzurLane;

public class MunitionShip extends Ship{
    String type = "Munition Ship";

    MunitionShip(String name, String rarity, String ID){
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

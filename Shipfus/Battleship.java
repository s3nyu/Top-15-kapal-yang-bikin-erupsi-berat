package Learn.Shipfus;

public class Battleship extends Ship{
    String type = "Battleship";
    
    Battleship(String name, String rarity, String ID){
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

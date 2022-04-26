package Learn.Shipfus;

public class Main {
    public static void main(String[] args) {
        
        AircraftCarrier ship1 = new AircraftCarrier("Shoukaku", "Super Rare", "228");
        AircraftCarrier ship2 = new AircraftCarrier("Victorious", "Super Rare", "146");
        AircraftCarrier ship3 = new AircraftCarrier("Shinano", "Ultra Rare", "231");
        Battleship ship4 = new Battleship("Cascogne", "Super Rare", "418");
        Battleship ship5 = new Battleship("Rodney", "Elite", "133");
        Destroyer ship6 = new Destroyer("Acasta","Elite", "082");
        LightCarrier ship7 = new LightCarrier("ChenHai", "Elite", "534");
        LightCarrier ship8 = new LightCarrier("Centaur", "Super Rare", "356");
        LightCarrier ship9 = new LightCarrier("Essex", "Super Rare", "357");
        LightCruiser ship10 = new LightCruiser("Sirius", "Super Rare", "371");
        LightCruiser ship11 = new LightCruiser("Avrora", "Super Rare", "262");
        LightCruiser ship12 = new LightCruiser("St. Louis", "Elite", "305");
        LightCruiser ship13 = new LightCruiser("Noshiro", "Super Rare", "322");
        LightCruiser ship14 = new LightCruiser("Dido", "Super rare", "107");
        MunitionShip ship15 = new MunitionShip("Kashino", "Elite", "472"); 

        ship1.display();
        ship2.display();
        ship3.display();
        ship4.display();
        ship5.display();
        ship6.display();
        ship7.display();
        ship8.display();
        ship9.display();
        ship10.display();
        ship11.display();
        ship12.display();
        ship13.display();
        ship14.display();
        ship15.display();


    }
    
}


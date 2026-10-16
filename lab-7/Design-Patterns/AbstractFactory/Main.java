package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        String style = "rustic";   // imagine this comes from the customer

        FurnitureFactory factory;
        if (style.equals("modern")) {
            factory = new ModernFurnitureFactory();
        } else if(style.equals("classic")) {
            factory = new ClassicFurnitureFactory();
        }
        else{
            factory = new RusticFurnitureFactory();
        }

        LivingRoom room = new LivingRoom(factory);
        room.describe();
    }
}


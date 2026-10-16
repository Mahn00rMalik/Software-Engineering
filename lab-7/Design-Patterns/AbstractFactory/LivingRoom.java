package AbstractFactory;

public class LivingRoom {
    private Chair chair;
    private Sofa sofa;

    LivingRoom(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa  = factory.createSofa();
    }

    void describe() {
        chair.show();
        sofa.show();
    }
}


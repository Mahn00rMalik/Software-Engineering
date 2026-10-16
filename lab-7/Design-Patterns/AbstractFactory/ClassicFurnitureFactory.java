package AbstractFactory;

public class ClassicFurnitureFactory  implements FurnitureFactory {
    public Chair createChair() { return new ClassicChair(); }
    public Sofa  createSofa()  { return new ClassicSofa(); }
}



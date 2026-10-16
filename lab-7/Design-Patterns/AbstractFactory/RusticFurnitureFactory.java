package AbstractFactory;

public class RusticFurnitureFactory implements FurnitureFactory {
    public Chair createChair() { return new RusticChair(); }
    public Sofa  createSofa()  { return new RusticSofa(); }
}


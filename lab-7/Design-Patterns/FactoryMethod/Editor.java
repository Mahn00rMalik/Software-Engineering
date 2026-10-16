package FactoryMethod;

public abstract class Editor {

    abstract Document createDocument(); // the factory method: no body

    void newFile() { // shared steps
        System.out.println("Creating New File");
        Document t = createDocument(); // "give me a document"
        t.open();
    }

}

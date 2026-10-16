package FactoryMethod;

public class WordEditor extends Editor {
    Document createDocument() { return new WordDocument(); }
}


package FactoryMethod;

public class TextEditor extends Editor {
    Document createDocument() { return new TextDocument(); }
}


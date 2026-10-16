package FactoryMethod;

public class PDFEditor extends Editor {
    Document createDocument() { return new PDFDocument(); }
}

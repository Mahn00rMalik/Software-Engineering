package FactoryMethod;

public class Main {

    public static void main(String[] args) {

        Editor pdf = new PDFEditor();
        pdf.newFile();

        Editor word = new WordEditor();
        word.newFile();

        Editor text = new TextEditor();
        text.newFile();

    }

}

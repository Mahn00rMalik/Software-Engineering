package Singleton;

public class SingletonPrinter {
    private static SingletonPrinter instance;
    private int jobsPrinted = 0;

    private SingletonPrinter() { }      // private: no one outside can call new

    public static SingletonPrinter getInstance() {
        if (instance == null) {
            instance = new SingletonPrinter();
        }
        return instance;
    }

    public void print(String text) {
        System.out.println("  Printing: " + text);
        jobsPrinted++;
    }

    public int getJobsPrinted() {
        return jobsPrinted;
    }
}

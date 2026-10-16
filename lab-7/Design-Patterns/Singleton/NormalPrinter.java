package Singleton;

public class NormalPrinter {
    private int jobsPrinted = 0;

    public NormalPrinter() { }          // public: anyone can call new

    public void print(String text) {
        System.out.println("  Printing: " + text);
        jobsPrinted++;
    }

    public int getJobsPrinted() {
        return jobsPrinted;
    }
}

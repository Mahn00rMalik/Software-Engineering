package Singleton;
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Version 1: Normal class, new called 3 times ===");
        NormalPrinter n1 = new NormalPrinter();
        NormalPrinter n2 = new NormalPrinter();
        NormalPrinter n3 = new NormalPrinter();

        n1.print("Assignment 1");
        n2.print("Assignment 2");
        n3.print("Assignment 3");

        System.out.println("  n1 jobs: " + n1.getJobsPrinted());
        System.out.println("  n2 jobs: " + n2.getJobsPrinted());
        System.out.println("  n3 jobs: " + n3.getJobsPrinted());
        System.out.println("  Same object? " + (n1 == n2 && n2 == n3));

        System.out.println();

        System.out.println("=== Version 2: Singleton, getInstance called 3 times ===");
        SingletonPrinter s1 = SingletonPrinter.getInstance();
        SingletonPrinter s2 = SingletonPrinter.getInstance();
        SingletonPrinter s3 = SingletonPrinter.getInstance();

        s1.print("Assignment 1");
        s2.print("Assignment 2");
        s3.print("Assignment 3");

        System.out.println("  s1 jobs: " + s1.getJobsPrinted());
        System.out.println("  s2 jobs: " + s2.getJobsPrinted());
        System.out.println("  s3 jobs: " + s3.getJobsPrinted());
        System.out.println("  Same object? " + (s1 == s2 && s2 == s3));

        // Uncomment the next line to show the compiler blocking new:
        // SingletonPrinter s4 = new SingletonPrinter();

    }
}
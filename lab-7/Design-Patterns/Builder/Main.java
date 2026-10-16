package Builder;

public class Main {
    public static void main(String[] args) {
        Sandwich lunch = new Sandwich.Builder("Brown")
                .filling("chicken")
                .addCheese()
                .addExtraSauce()
                .build();

        Sandwich snack = new Sandwich.Builder("White")
                .addLettuce()
                .build();

        System.out.println(lunch);
        System.out.println(snack);
    }
}

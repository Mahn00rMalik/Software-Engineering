package Builder;

public class Sandwich 
{
    private String bread;
    private String filling;
    private boolean cheese;
    private boolean lettuce;
    private boolean extraSauce;

    // Step 5: only the Builder can create a Sandwich
    private Sandwich(Builder b) {
        bread      = b.bread;
        filling    = b.filling;
        cheese     = b.cheese;
        lettuce    = b.lettuce;
        extraSauce = b.extraSauce;
    }

    public String toString() {
        String result = bread + " bread with " + filling;
        if (cheese)     result += ", cheese";
        if (lettuce)    result += ", lettuce";
        if (extraSauce) result += ", extra sauce";
        return result;
    }

    // Step 1: the builder lives inside Sandwich
    static class Builder {
        private String bread;
        private String filling = "no filling";   // default value
        private boolean cheese;
        private boolean lettuce;
        private boolean extraSauce;

        // Step 2: required field in the constructor
        Builder(String bread) {
            this.bread = bread;
        }

        // Step 3: one method per optional field, each returns this
        Builder filling(String f) { this.filling = f; return this; }
        Builder addCheese()       { this.cheese = true; return this; }
        Builder addLettuce()      { this.lettuce = true; return this; }
        Builder addExtraSauce()   { this.extraSauce = true; return this; }

        // Step 4: create the finished object
        Sandwich build() {
            return new Sandwich(this);
        }
    }
}

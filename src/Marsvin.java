public class Marsvin {
    private String name;
    private String race;
    private int food;

    public Marsvin(String name, String race, int food){
        this.name = name;
        this.race = race;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getFood() {
        return food;
    }

    @Override
    public String toString() {
        return name + " " + race + " " + "Eats " + food + "g" + " of food a day";
    }
}

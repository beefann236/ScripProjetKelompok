
public class Warrior extends Player {
    private int strength;

    //Default Constructor
    public Warrior() {
        super();
        strength = 0;
    }

    //Constructor with parameters
    public Warrior(String name, int health, int level, int strength) {
        super(name, health, level);
        this.strength = strength;
    }

    //Getter
    public int getStrength() {
        return strength;
    }

    //Setter
    public void setStrength(int strength) {
        this.strength = strength;
    }
    
}

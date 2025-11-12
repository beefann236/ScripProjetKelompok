

public class Player extends Character {
    private int level;

    //Default Constructor
    public Player() {
        super();
        level = 0;
    }

    //Constructor with parameters
    public Player(String name, int health, int level) {
        super(name, health);
        this.level = level;
    }

    //Getter
    public int getLevel() {
        return level;
    }

    //Setter
    public void setLevel(int level) {
        this.level = level;
    }
}

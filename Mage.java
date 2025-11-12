

public class Mage extends Player {
    private int mana;

    //Default Constructor
    public Mage() {
        super();
        mana = 0;
    }

    //Constructor with parameters
    public Mage(String name, int health, int level, int mana) {
        super(name, health, level);
        this.mana = mana;
    }

    //Getter
    public int getMana() {
        return mana;
    }

    //Setter
    public void setMana(int mana) {
        this.mana = mana;
    }

}

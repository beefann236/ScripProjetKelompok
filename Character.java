

public class Character {
   private String name;
   private int health;

   //Default Constructor
   public Character() {
       name = "";
       health = 0;
   }

   //Constructor with parameters
    public Character(String name, int health) {
         this.name = name;
         this.health = health;
    }


    //Getter
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
}

    public void setHealth(int health) {
        this.health = health;
    }
}

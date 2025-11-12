

public class Enemy extends Character {
    private String type;
    private int level;

    //Default Constructor
    public Enemy() {
        super();
        type = "";
    
    }

    //Constructor with parameters
    public Enemy(String name, int health, String type) {
        super(name, health);
        this.type = type;
      
    }

    //Getter
    public String getType() {
        return type;
    }

  

    //Setter
    public void setType(String type) {
        this.type = type;
    }
    
  
}

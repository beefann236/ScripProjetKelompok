
public class LandOfDown {
    public static void main(String[] args) {
        Enemy enemy = new Enemy("Minotaur", 100, "Monster");
        Mage mage = new Mage("Odette", 80, 13, 200);
        Warrior warrior = new Warrior("Lapu-lapu", 120, 15, 150);

        //Menampilkan hasil data
        System.out.println("========== Enemy ==========");
        System.out.println("Name: " + enemy.getName());
        System.out.println("Health: " + enemy.getHealth());
        System.out.println("Type: " + enemy.getType());

        System.out.println("\n========== Mage ==========");
        System.out.println("Name: " + mage.getName());
        System.out.println("Health: " + mage.getHealth());
        System.out.println("Level: " + mage.getLevel());
        System.out.println("Mana: " + mage.getMana());
        
        System.out.println("\n========== Warrior ==========");
        System.out.println("Name: " + warrior.getName());
        System.out.println("Health: " + warrior.getHealth());
        System.out.println("Level: " + warrior.getLevel());
        System.out.println("Strength: " + warrior.getStrength());
    }
}

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <=0) {
            System.out.println("Plyaer knocked out of the game");
        }
    }

    public int healthRemaining() {
        return health;
    }
    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;
        if (health > 100) {
            System.out.println("Health fully restored.");
            health = 100;
        }
    }
}

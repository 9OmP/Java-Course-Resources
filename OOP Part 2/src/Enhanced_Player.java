public class Enhanced_Player {

    private String name;
    private int health;
    private String weapon;

    public Enhanced_Player(String name, int health, String weapon) {
        this.name = name;
        if (health < 0){
            this.health = 1;
        } else this.health = Math.min(health, 100);

        this.weapon = weapon;
    }

    public Enhanced_Player(String name) {
        this(name, 10, "Sword");
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if (this.health < 0){
            System.out.println("Player knocked out of Game.");
        }
    }

    public void restoreHealth(int extraHealth){
        this.health += extraHealth;
        if (this.health > 100){
            System.out.println("Player restored to 100%.");
            this.health = 100;
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}

// Base class others will inherit from
public class Player {
    private int health;
    private String name;
    private int damage;

    public Player(int health, String name, int damage) {
        this.health = health;
        this.name = name;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}

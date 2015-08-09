import java.util.concurrent.TimeUnit;

// Base class others will inherit from
public class Player {
    private int health;
    private String name;
    private int damage;

    public Player(int health, String name) {
        this.health = health;
        this.name = name;
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
        int damage = 1 + (int)(Math.random() * 10);
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static void battle(Player p1, Player p2) throws InterruptedException {
            int dam1 = 0;
            int hp1 = 0;
            int dam2 = 0;
            int hp2 = 0;
            boolean isDead = false;
            do
            {
                dam1 = p1.getDamage();
                System.out.println(p1.getName() + " Strikes for: " + p1.getDamage());
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hp2 = (p2.getHealth() - dam1);

                if (hp2 < 1)
                {
                    System.out.println(p1.getName() + " Is victorious! ");
                    isDead = true;
                    System.exit(0);
                }
                p2.setHealth(hp2);
                dam2 = p2.getDamage();
                System.out.println(p2.getName() + " Strikes for: " + p2.getDamage());
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hp1 = (p1.getHealth() - dam2);

                if (hp1 < 1)
                {
                    System.out.println(p2.getName() + " Is victorious! ");
                    isDead = true;
                    System.exit(0);
                }
                p1.setHealth(hp1);
                System.out.println(p1.getName() + " HP " + p1.getHealth() + " --- " + p2.getName() + " HP " + p2.getHealth());
            }while(!isDead);

        }
}



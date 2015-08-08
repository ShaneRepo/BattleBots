// Main class of the program
public class BattleBots {
    public static void main(String[] args){
        // Testing the implementation of an Orc object
        Orc o = new Orc();
        System.out.println(o.getDamage());
        System.out.println(o.getHealth());
        System.out.println(o.getName());
        System.out.println();
        // Testing the implementation of an Elf object
        Elf e = new Elf();
        System.out.println(e.getDamage());
        System.out.println(e.getHealth());
        System.out.println(e.getName());
        System.out.println();
        // Testing the implementation of an Elf object
        Human h = new Human();
        System.out.println(h.getDamage());
        System.out.println(h.getHealth());
        System.out.println(h.getName());
    }
}

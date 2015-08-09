import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class BattleBots {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Battle Bots");
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        int choice, choice2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Battle Bots!");
        do {
            System.out.println("Please pick a class. 1. Human, 2. Orc, 3. Elf.");
            choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 1:
                    System.out.println("You choose Human!");
                    Human h = new Human();
                    Orc o = new Orc();
                    Player.battle(h,o);
                    break;
                case 2:
                    System.out.println("You choose Orc!");
                    o = new Orc();
                    Elf e = new Elf();
                    Player.battle(o,e);
                    break;
                case 3:
                    System.out.println("You choose Elf!");
                    e = new Elf();
                    h = new Human();
                    Player.battle(e,h);
                    break;
                default:
                    System.out.println("Error! Please choose 1, 2, or a 3.");
            }
        }while(choice < 1 || choice > 3);



    }


}




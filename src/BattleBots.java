import java.util.Scanner;

public class BattleBots {
    public static void main(String[] args) throws InterruptedException {

        /*Orc o = new Orc();
        Elf e = new Elf();
        Player.battle(o, e);*/
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Battle Bots!");
        do {
            System.out.println("Please pick a class. 1. Human, 2. Orc, 3. Elf.");
            choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 1:
                    System.out.println("You choose Human!");
                    break;
                case 2:
                    System.out.println("You choose Orc!");
                    break;
                case 3:
                    System.out.println("You choose Elf!");
                    break;
                default:
                    System.out.println("Error! Please choose 1, 2, or a 3.");
            }
        }while(choice < 1 || choice > 3);


    }


}




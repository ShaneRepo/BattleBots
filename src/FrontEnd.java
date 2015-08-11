import javax.swing.*;
import java.awt.*;

public class FrontEnd extends JFrame {

    private JButton human = new JButton("Human");
    private JButton orc = new JButton("Orc");
    private JButton elf = new JButton("Elf");
    private JButton start = new JButton("Start Game");
    private JLabel title = new JLabel("Welcome to Battle Bots!");

    public FrontEnd(){
        super("Battle Bots");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }
}

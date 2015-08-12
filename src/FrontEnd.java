import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontEnd extends JFrame implements ActionListener {
    Container con = getContentPane();
    JButton human = new JButton("Human");
    JButton orc = new JButton("Orc");
    JButton elf = new JButton("Elf");
    JLabel pickChar = new JLabel("Choose a Character");
    JLabel title = new JLabel("Welcome to Battle Bots!");
    JTextArea text = new JTextArea();


    public FrontEnd(){
        super("Battle Bots");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 400);
        con.setLayout(new FlowLayout());
        //Font titleFont = new Font("Helvetica",Font.BOLD,18);
        //title.setFont(titleFont);
        con.add(title);
        con.add(pickChar);
        con.add(human);
        con.add(orc);
        con.add(elf);
        human.addActionListener(this);
        orc.addActionListener(this);
        elf.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

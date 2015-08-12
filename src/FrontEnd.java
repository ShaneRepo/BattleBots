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
        con.add(text);
        human.addActionListener(this);
        orc.addActionListener(this);
        elf.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == human){
            Human h = new Human();
            Orc o = new Orc();
            try {
                Player.battle(h,o);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }else if (source == orc){
            Orc o = new Orc();
            Elf el = new Elf();
            try {
                Player.battle(o,el);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        } else if (source == elf) {
            Human h = new Human();
            Elf el = new Elf();
            try {
                Player.battle(el, h);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }else {
            text.setText("Error!");
            System.exit(1);
        }
    }
}

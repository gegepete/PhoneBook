import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    private JButton stergeCntc, modificaCntc, adaugaCntc;
    private JMenuBar mb;
    private JMenu m1, m2;
    private JMenuItem mi1, mi2, mi3;
    
    public GUI(){
        super("AgendaTelefonica by Vije");
        
        mb = new JMenuBar();
        setJMenuBar(mb);
        m1 = new JMenu("Optiuni");
        mb.add(m1);
        m2 = new JMenu("Despre");
        mb.add(m2);
        
        stergeCntc = new JButton("Sterge");
        modificaCntc = new JButton("Modifica");
        adaugaCntc = new JButton("Adauga");
        
        setSize(750, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        
    }
}
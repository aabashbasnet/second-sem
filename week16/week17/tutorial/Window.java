package week16.week17.tutorial;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class WIndow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Window extends JFrame
{
    public Window()
    {
        setTitle("CS4001NI Programming");
        setSize(400,500);
        
        JPanel panel= new JPanel();
        
        panel.setBackground(Color.PINK);
        panel.setBorder(BorderFactory.createTitledBorder("User Info"));
        JLabel label = new JLabel("Username: ");
        label.setBounds(50,50,100,30);
        JTextField txtField =  new JTextField();
        txtField.setBounds(110,50,100,30);
        JButton btn = new JButton("Submit");
        
        btn.setForeground(new Color(255,200,0));
        btn.setBounds(50,80,100,30);
        panel.add(btn);
        panel.add(txtField);
        panel.add(label);
        panel.setLayout(null);
        btn.setBackground(Color.RED);
        btn.setOpaque(true);
    btn.setBorderPainted(false);
    btn.setContentAreaFilled(true);
        
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
    }
    public static void main(String[] args)
    {
      Window wd= new Window();
      wd.setVisible(true);
    }
}
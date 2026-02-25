package week16.week17.workshop;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question5 extends JFrame
{
    question5()
    {
    setTitle("Login Window");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,500);
    setLayout(null);
    
    JPanel panel = new JPanel();
    panel.setBounds(0,0,400,400);
    JLabel username = new JLabel("Username :");
    username.setBounds(20,20,100,40);
    JTextField txtField =  new JTextField();
    txtField.setBounds(100,25,100,30);
    JButton btn = new JButton("Login");
    
    btn.setForeground(Color.BLUE);
    btn.setBounds(150,150,100,80);
    panel.add(username);
    panel.add(txtField);
    panel.add(btn);
    add(panel);
    btn.setBackground(Color.RED);
    
    btn.setBorderPainted(false);
    
    btn.setOpaque(true);
    panel.setBounds(5,5,400,400);
    
    panel.setLayout(null);
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            question5 q5 = new question5();
            q5.setVisible(true);
        });
    }
}
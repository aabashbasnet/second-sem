package week16.week17.workshop;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1 extends JFrame
{
     public q1()
        {
            JPanel panel= new JPanel();
            panel.setBackground(Color.PINK);
            add(panel);
            panel.setBounds(20,30,400,400);
            setTitle("Library Notice");
            setSize(400,300);
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label = new JLabel("Library Opens at 7:00 AM");
            label.setFont(new Font("Arial",Font.BOLD,20));
            label.setBounds(0,0,50,50);
            setLayout(null);
            panel.add(label);
        }
        public static void main(String[] args)
        {
            q1 q= new q1();
            q.setVisible(true);
        }
        
}
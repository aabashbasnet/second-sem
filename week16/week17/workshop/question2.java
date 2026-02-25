package week16.week17.workshop;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question2 extends JFrame
{
    public question2()
    {
    JPanel panel = new JPanel();
    panel.setBackground(Color.blue);
    setSize(400,400);
    JLabel label = new JLabel("Welcome to Orientation Day");
    label.setBounds(0, 0, 200, 40);
    add(label);
    setLayout(null);
    setLocationRelativeTo(null);
    setResizable(false);
    }
    public static void main(String[] args)
    {
        question2 q2 = new question2();
        q2.setVisible(true);
    }
}
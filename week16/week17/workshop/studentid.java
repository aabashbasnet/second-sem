package week16.week17.workshop;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class studentid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class studentid extends JFrame
{
    public studentid()
    {

        JPanel panel = new JPanel();
        panel.setBounds(0,0,500,500);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        String htmlText ="<html><body><p>Name : Aabash Basnet</p><p>Module : Programming</p> <p>College: Islington College</p></body></html>";
        JLabel label = new JLabel(htmlText,SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setBounds(5,5,500,500);
        add(panel);
        panel.add(label);
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        setLayout(null);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            studentid sid = new studentid();
            sid.setVisible(true);
        });
    }
}
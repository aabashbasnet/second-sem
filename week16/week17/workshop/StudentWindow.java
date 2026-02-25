package week16.week17.workshop;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentWindow extends JFrame
{
    public StudentWindow()
    {
       setTitle("Student Profile"); 
       setSize(500,500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            StudentWindow sw = new StudentWindow();
            sw.setVisible(true);
        });
    }
}
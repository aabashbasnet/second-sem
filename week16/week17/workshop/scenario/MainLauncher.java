package week16.week17.workshop.scenario;
import javax.swing.*;

/**
 * Write a description of class MainLauncher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainLauncher
{
    public static void main(String[] args)
    {
        Student s1 = new Student(1,"Aabash","Programming");
        Student s2 = new Student(2,"Ram","God");
        SwingUtilities.invokeLater(()->
        {
            IDCardWindow id1 = new IDCardWindow(s1);
            id1.setVisible(true);
            
            IDCardWindow id2 = new IDCardWindow(s2);
            id2.setVisible(true);
        });
    }
}
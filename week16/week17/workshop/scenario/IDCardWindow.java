package week16.week17.workshop.scenario;
import javax.swing.*;


/**
 * Write a description of class IDCardWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IDCardWindow extends JFrame
{
    public IDCardWindow(Student student)
    {
        JPanel panel = new JPanel();
        JLabel label = new JLabel(student.html());
        panel.setLayout(null);
        panel.setBounds(0,0,400,200);
        label.setBounds(5,5,200,100);
        
        add(panel);
        setTitle("ID Card Window");
        setSize(450,300);
        panel.add(label);
        setLayout(null);
        setLocationRelativeTo(null);
    }
    
    
}
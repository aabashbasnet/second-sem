package week16.week17.workshop.scenario;
import javax.swing.*;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int studentId;
    private String name;
    private String course;
    
    public Student(int studentId, String name, String course)
    {
        this.studentId=studentId;
        this.name=name;
        this.course=course;
    }
    
    int getStudentId()
    {
        return this.studentId;
    }
    
    String getName()
    {
        return this.name;
    }
    
    String getCourse()
    {
        return this.course=course;
    }
    
    public String html()
    {
        return "<html><body><p>Student ID : "+getStudentId()+"</p> <p>Name : "+getName()+"</p> <p>Course : "+getCourse()+"</p></body></html>";
    }
}
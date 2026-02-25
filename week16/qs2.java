package week16;


/**
 * Write a description of class qs2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qs2
{
    public static void main(String[] args)
    {
        String sentence=" I am doing workshop  ";
        String sen2=sentence.trim();
        System.out.println(sen2);
        sen2.substring(0,10);
        String[] parts= sen2.split(" ");
        for(int i=0;i<parts.length;i++)
        {
            System.out.println(parts[i]);
        }
    
    }
}
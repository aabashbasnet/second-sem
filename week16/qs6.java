package week16;
import java.util.Scanner;


/**
 * Write a description of class qs6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qs6
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word");
        String word= sc.nextLine();
        StringBuilder sb= new StringBuilder();
        for(int i=word.length()-1;i>=0;i--)
        {
            sb.append(word.charAt(i));
        }
        System.out.println(sb.toString());
        
        if(word.equals(sb.toString()))
        {
            System.out.println("The string is a palindrome");
        }
        else
        {
            System.out.println("The string is not a palindrome");
        }
        
    }
}
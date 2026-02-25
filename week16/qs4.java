package week16;
import java.util.Scanner;


/**
 * Write a description of class qs4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qs4
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence= sc.nextLine();
        String trim= sentence.trim();
        String upper=trim.toUpperCase();
        System.out.println("Sentence in upper case"+upper);
        String lower=trim.toLowerCase();
        System.out.println("Sentence in lower case"+lower);
        String words[]=trim.split("\\s+");
        StringBuilder sb= new StringBuilder();
        
        for(String word:words)
        {
            String first=word.substring(0,1).toUpperCase();
            String second=word.substring(1).toLowerCase();
            sb.append(first).append(second).append(" ");
        }
        
        for(int i=0;i<words.length;i++)
        {
            String first=words[i].substring(0,1).toUpperCase();
            String rest=words[i].substring(0,1).toLowerCase();
            sb.append(first).append(rest).append(" ");
        }
        System.out.println(sb);
    }
}
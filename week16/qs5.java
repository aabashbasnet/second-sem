package week16;
import java.util.Scanner;


/**
 * Write a description of class qs5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qs5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first word");
        String first= sc.nextLine();
        System.out.println("Enter the second word");
        String second=sc.nextLine();
        StringBuilder sb= new StringBuilder();
        sb.append(first).append(second);
        System.out.println("Enter a integer");
        int integer= sc.nextInt();
        sb.append(integer);
        System.out.println("Enter a char");
        char character=sc.next().charAt(0);
        sb.append(character);
        System.out.println(sb);
        
    }
}
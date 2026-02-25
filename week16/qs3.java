package week16;
import java.util.Scanner;


/**
 * Write a description of class qs3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qs3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence= sc.nextLine();
        System.out.println("Enter the index of the char you want");
        int index= sc.nextInt();
        System.out.println("The char at index "+index+"is "+sentence.charAt(index));
        System.out.println("Enter the character you want the index of");
        char character= sc.next().charAt(0);
        System.out.println(sentence.indexOf(character));
        System.out.println("Enter the word you want to check the position");
        String word = sc.nextLine();
        sc.nextLine();
        boolean result= sentence.contains(word);
        System.out.println(result);
    }
}
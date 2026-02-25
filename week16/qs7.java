package week16;
import java.util.Scanner;


/**
 * Write a description of class qs7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qs7
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        qs7 obj= new qs7();
        String phone;
        obj.isValidPhone("9834567899");
        
    }
    void isValidPhone(String phone)
        {
            if(phone.matches("^(98|97)\\d{8}$"))
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("not valid");
            }
        }
}
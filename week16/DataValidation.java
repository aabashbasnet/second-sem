package week16;


/**
 * Write a description of class DataValidation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataValidation
{
    public static boolean isValidCitizenship(String cit)
    {
        //checks whether the entered citizenship id has 10 characters or not
        if(cit.length() != 10){
            return false; 
        }
        //checks whether the 2nd index of the citizenship id contains '-' or not
        if(cit.charAt(2) != '-'){
            return false;
        }
        //checks whether the first 2 characters of the citizenship id is digit or not
        if(!Character.isDigit(cit.charAt(0)) || !Character.isDigit(cit.charAt(1)))
        {
            return false;
        }
        //checks whether the last 7 characters of the citizenship id is digit or not
        for(int i=3; i<10; i++){
            if(!Character.isDigit(cit.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isValidPhone(String phone)
    {
        //checks whether the entered phone number has 10 characters or not
        if(phone.length() != 10){
            return false;
        }
        //checks whether the phone numbers starts form 98/97 or not
        if(!phone.substring(0,2).equals("98") && !phone.substring(0,2).equals("97"))
        {
            return false;
        }
        //checks if all the characters of the phonenumber are numeric characters or not
        for(int i=0; i<10; i++){
            if(!Character.isDigit(phone.charAt(i))) 
            {
                return false;
            }
        }
        return true;
    }
}
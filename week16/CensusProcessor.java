package week16;
import java.util.*;


/**
 * Write a description of class CensusProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CensusProcessor
{
        public static Student[] parseCSV(String[] csvData){
        ArrayList<Student> students = new ArrayList<>();
        
        for(int i=1; i<csvData.length; i++){
            String row = csvData[i];
            String fields[] = row.split(","); 
            
            if(fields.length == 6) 
            {
                String name = fields[0].trim(); 
                int age = Integer.parseInt(fields[1]); 
                String school = fields[2].trim();
                int grade = Integer.parseInt(fields[3]);
                String citizenship = fields[4].trim();
                String phone = fields[5].trim();
                
                Student s = new Student(name, age, school, grade, citizenship, phone);
                students.add(s);
            }
        }
        Student studentArray[] = new Student[students.size()]; 
        studentArray = students.toArray(studentArray); 
        for(Student s : students)
        {
            System.out.println(s); 
        }
        return studentArray;
    }
    
    
    public static Student[] findBySchool(Student[] students, String school)
    {
        ArrayList<Student> result = new ArrayList<>(); 
        for(Student s : students)
        {
            if(s.getSchool().equalsIgnoreCase(school))
            {
                result.add(s); 
            }
        }
        return result.toArray(new Student[0]);
    }
    
   
    public static int countBySchool(Student[] students, String school)
    {
        int count = 0;
        for(Student s: students)
        {
            if(s.getSchool().equalsIgnoreCase(school))
            {
                count++; 
            }
        }
        return count;
    }
    
    
    public static double averageAge(Student[] students)
    {
        double sum = 0;
        for(Student s : students)
        {
            sum += s.getAge(); 
        }
        double averageAge = sum / students.length; 
        return averageAge;
    }
    
    
    public static Student findLongestName(Student[] students)
    {
        Student longest = students[0]; 
        for(Student s: students)
        {
            if(s.getName().length() > longest.getName().length())
            {
                longest = s;
            }
        }
        return longest;
    }
    
    
    public static String generateCensusReport(Student[] students)
    {
        StringBuilder report = new StringBuilder(); 
        
        report.append("\n\n------------- Nepal School Census Report -------------\n"); 
        int validCount = 0;
        int invalidCount = 0;
        
        report.append(String.format("%-6s %-24s %-8s %-24s %-8s %-15s %-15s\n", "Init", "Name", "Age", "School", "Grade", "Citizenship", "Phone")); 
        report.append("----------------------------------------------------------------------------------------------------------------------------\n");
        for(Student s: students)
        {
            boolean validCit = DataValidation.isValidCitizenship(s.getCitizenship());
            boolean validPhone = DataValidation.isValidPhone(s.getPhone());
            
            if(validCit && validPhone)
            {
                validCount++; 
            }
            else
            {
                invalidCount++; 
            }
            
            report.append(String.format("%-6s %-24s %-8s %-24s %-8s %-15s %-15s\n",s.getNameInitials(),s.getName(),s.getAge(),s.getSchool(),s.getGrade(),validCit? "VALID" : "INVALID",validPhone? "VALID" : "INVALID"));
        }
        
        
        report.append("\n---- Statistics ----\n");
        report.append(String.format("Total Students: %-6d Valid: %-6d Invalid: %-6d\n", students.length, validCount, invalidCount));
        report.append(String.format("Average Age: %.2f\n", averageAge(students)));
        report.append(String.format("Longest name: %-20s\n", findLongestName(students)));
        report.append(String.format("%-20s : %-5d", "Itahari Intl College", countBySchool(students,"Itahari Int. College")));
        return report.toString();
    }
    }
    
    

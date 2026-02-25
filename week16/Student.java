package week16;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
        String name;
        int age;
        String school;
        int grade;
        String citizenship;
        String phone;
        
        public Student(String name,int age,String school,int grade,String citizenship,String phone)
        {
            this.name=name;
            this.age=age;
            this.school=school;
           this.grade=grade;
           this.citizenship=citizenship;
           this.phone=phone;
        }
        
        String getName()
        {
            return this.name;
        }
        
        void setName(String name){
            this.name=name;
        }
        
        int getAge()
        {
            return this.age;
        }
        
        void setAge(int age)
        {
            this.age=age;
        }
        
        String getSchool()
        {
            return this.school;
        }
        
        void setSchool(String school){
            this.school=school;
        }
        
        int getGrade()
        {
            return this.grade;
        }
        
        void setGrade(int grade)
        {
            this.grade=grade;
        }
        
        String getCitizenship()
        {
            return this.citizenship;
        }
        
        void setCitizenship(String citizenship){
            this.citizenship=citizenship;
        }
        
        String getPhone()
        {
            return this.phone;
        }
        
        void setPhone(String phone){
            this.phone=phone;
        }
        
        String getNameInitials()
        {
            StringBuilder initial = new StringBuilder();
            String parts[] = getName().split("\\s+");
            for(String part: parts)
            {
                initial.append(part.substring(0,1).toUpperCase()).append(".");
            }
            return initial.toString();
        }
        
        @Override
        public String toString()
        {
            return String.format("%-20s | %-5d | Grade %-4d | %-20s", getName(), getAge(), getGrade(), getSchool());
        }
        
        
        
        
    }
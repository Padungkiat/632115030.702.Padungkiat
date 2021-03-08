package Equals;
/**
 * StudentData
 */
public class StudentData {

    public static void main(String[] args) {

        //Student object include name,age,gpa
        
        Student std01 = new Student("Mark",18,4.00);
        
        Student std02 = new Student("Jane",18,2.20);
        
        Student std03 = new Student("Peter",19,4.00);
        
        Student std04 = new Student("Mark",22,1.75);
        
        System.out.println("Name");
        System.out.println(std01.name.equals(std02.name));
        System.out.println(std01.name.equals(std03.name));
        System.out.println(std02.name.equals(std04.name));
        System.out.println(std01.name.equals(std04.name));
        System.out.println(".......................................");

        System.out.println("Age");
        System.out.println(std01.equals(std02));
        System.out.println(std03.equals(std04));
        System.out.println(std01.equals(std03));
        System.out.println(".......................................");


        System.out.println("GPA");
        System.out.println(std01.equals(std03));
        System.out.println(std02.equals(std04));
        System.out.println(std02.equals(std03));
        System.out.println(".......................................");
        }
}
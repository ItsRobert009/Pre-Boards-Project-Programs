import java.util.*;
class Student
{
    int roll;
    String name;
    Dates dob;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number:");
        roll = sc.nextInt();
        System.out.println("Enter name:");
        name = sc.nextLine();
        dob = new Dates();
        dob.accept();
    }
    void display()
    {
        System.out.println(name);
        System.out.println(roll);
        dob.display();
        Dates today=new Dates();
        today.accept();
        int age=today.yy-dob.yy;
        if(today.mm<dob.mm || (today.mm==dob.mm && today.mm<dob.mm))
            age--;
        System.out.println(age);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.accept();
        s1.display();
    }
    public class Dates
    {
        int dd,mm,yy;
        void accept()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter dd:");
            dd = sc.nextInt();
            System.out.println("Enter mm:");
            mm = sc.nextInt();
            System.out.println("Enter yy:");
            yy = sc.nextInt();
        }
        void display()
        {
            System.out.println(dd+"/"+mm+"/"+yy);
        }
    }
}

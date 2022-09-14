import java.util.*;
public class Term_Deposit_Scheme
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double I=0.0,A=0.0;
        System.out.println("Enter the age of the person");
        int age=sc.nextInt();
        System.out.println("Enter the sum deposited");
        int sum=sc.nextInt();
        System.out.println("Enter the term");
        int t = sc.nextInt();
        if (age>=60)
        {
            if (t==1)
            {
                I=(sum*8.0*t)/100.0;
                A=(sum+I);
            }
            else if (t==2)
            {
                I=(sum*9.0*t)/100.0;
                A=(sum+I);
            }
            else if (t==3)
            {
                I=(sum*10.0*t)/100.0;
                A=(sum+I);
            }
            else
            {
                I=(sum*11.0*t)/100.0;
                A=(sum+I);
            }
        }
        else
        {
            if (t==1)
            {
                I=(sum*7.5*t)/100.0;
                A=(sum+I);
            }
            else if (t==2)
            {
                I=(sum*8.5*t)/100.0;
                A=(sum+I);
            }
            else if (t==3)
            {
                I=(sum*9.5*t)/100.0;
                A=(sum+I);
            }
            else
            {
                I=(sum*10.0*t)/100.0;
                A=(sum+I);
            }
        }
        System.out.println("Amount deposited = "+sum);
        System.out.println("Term = "+t);
        System.out.println("Age = "+age);
        System.out.println("Interest earned = "+I);
        System.out.println("Amount paid = "+A);
    }
}
import java.util.*;
public class Stream
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your marks in English");
        int eng=sc.nextInt();
        System.out.println("Enter your marks in Maths");
        int math=sc.nextInt();
        System.out.println("Enter your marks in Science");
        int sci=sc.nextInt();
        if (eng>=80 && math>=80 && sci>=80)
        {
            System.out.println("Pure Science");
        }
        else if (eng>=80 && sci>=80 && math>=60)
        {
            System.out.println("Bio. Science");
        }
        else if (eng>=60 && math>=60 && sci>=60)
        {
            System.out.println("Commerce");
        }
    }
}

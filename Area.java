import java.util.*;
public class Area
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your choice:");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Square");
        System.out.println("3. Area of Rectangle");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter the radius of the circle");
                double r = sc.nextDouble();
                double Ac=3.14*r*r;
                System.out.println("The area of circle = "+Ac);
                break;
            case 2:
                System.out.println("Enter the side of the square");
                double s = sc.nextDouble();
                double As=s*s;
                System.out.println("The area of square = "+As);
                break;
            case 3:
                System.out.println("Enter the length and breadth of the rectangle");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                double Ar=l*b;
                System.out.println("The area of rectangle = "+Ar);
                break;
            default:
                System.out.println("Wrong choice!");
        }
    }
}

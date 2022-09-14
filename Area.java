/* Write a menu driven program to calculate:
   (a) Area of a circle = p*r*r, where p = 22/7
   (b) Area of a square = side*side
   (c) Area of a rectangle = length*breadth */

import java.util.*; // importing java.util package
public class Area
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in); // declaration of Scanner class
        System.out.println("Enter your choice:");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Square");
        System.out.println("3. Area of Rectangle");
        int ch = sc.nextInt(); // taking input from the user
        switch (ch) // applying switch case statement to the input
        {
            case 1:
                System.out.println("Enter the radius of the circle");
                double r = sc.nextDouble(); // taking input of the radius of the circle
                double Ac=3.14*r*r; // calculating the area of circle
                System.out.println("The area of circle = "+Ac);
                break;
            case 2:
                System.out.println("Enter the side of the square");
                double s = sc.nextDouble(); // taking the input of side of the square
                double As=s*s; // calculating the area of the square
                System.out.println("The area of square = "+As);
                break;
            case 3:
                System.out.println("Enter the length and breadth of the rectangle");
                double l = sc.nextDouble(); // taking input of the length of the rectangle
                double b = sc.nextDouble(); // taking input of the breadth of the rectangle
                double Ar=l*b; // calculating the area of the rectangle
                System.out.println("The area of rectangle = "+Ar);
                break;
            default:
                System.out.println("Wrong choice!");
        }
    }
}

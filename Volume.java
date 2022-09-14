import java.util.*;
public class Volume
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your choice:");
        System.out.println("1. Volume of a cube");
        System.out.println("2. Volume of a sphere");
        System.out.println("3. Volume of a cuboid");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter the side of the cube");
                double s= sc.nextDouble();
                double vc=s*s*s;
                System.out.println("The volume of the cube is: "+vc);
                break;
            case 2:
                System.out.println("Enter the radius of the sphere");
                double r=sc.nextDouble();
                double vs=4/3*3.14*r*r*r;
                System.out.println("The volume of the sphere is: "+vs);
                break;
            case 3:
                System.out.println("Enter the length, breadth and height of the cuboid");
                double l=sc.nextDouble();
                double b=sc.nextDouble();
                double h=sc.nextDouble();
                double vcd=l*b*h;
                System.out.println("The volume of the cuboid is: "+vcd);
                break;
            default:
                System.out.println("Wrong choice!");
        }
    }
}

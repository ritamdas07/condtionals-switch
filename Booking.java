import java.util.*;
public class Booking
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int w; // taking a variable to store the weight of the parcel
        char ch; // taking a variable to store the choice of the user
        System.out.println("Enter the weight of the parcel in gram");
        w=sc.nextInt(); // taking the input of the weight from the user
        System.out.println("Enter the type of booking");
        System.out.println("Enter 'O' for ordinary booking and 'E' for express booking");
        ch = sc.next().charAt(0); // taking the input of choice from the user
        switch(ch)
        {
            case 'O': // for Ordinary Booking
                if (w<=100)
                {
                    System.out.println("Rs. 80");
                    break;
                }
                else if (w>100 && w<=500)
                {
                    System.out.println("Rs. 150");
                    break;
                }
                else if (w>500 && w<=1000)
                {
                    System.out.println("Rs. 210");
                    break;
                }
                else
                {
                    System.out.println("Rs. 250");
                    break;
                }
            case 'E': // for Express Booking
                if (w<=100)
                {
                    System.out.println("Rs. 100");
                    break;
                }
                else if (w>100 && w<=500)
                {
                    System.out.println("Rs. 200");
                    break;
                }
                else if (w>500 && w<=1000)
                {
                    System.out.println("Rs. 250");
                    break;
                }
                else
                {
                    System.out.println("Rs. 300");
                    break;
                }
            default:
                System.out.println("Wrong choice!");
        }
    }
}

import java.util.*;
public class Bus_Fare
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int km, fare=0;
        System.out.println("Enter the distance travelled");
        km = sc.nextInt(); // tkaing the input of the distance covered
        if (km<=10)
        {
            System.out.println("Pay Rs. 80");
        }
        else if (km>=11 && km<=20)
        {
            fare = ((km-10)*6)+80;
            System.out.println("Pay Rs. "+fare);
        }
        else if (km>=21 && km<=30)
        {
            fare = ((km-10)*5)+80;
            System.out.println("Pay Rs. "+fare);
        }
        else
        {
            fare = ((km-10)*4)+80;
            System.out.println("Pay Rs. "+fare);
        }
    }
}

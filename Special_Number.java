import java.util.*;
public class Special_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s=0,p=1,n,r,ts=0,num;
        System.out.println("Enter a two digit number");
        n=sc.nextInt();
        num=n;
        while(num>0)
        {
            r=num%10;
            s=s+r;
            p=p*r;
            num=num/10;
        }
        ts=s+p;
        if (ts==n)
            System.out.println("It is a special 2-digit number");
        else
            System.out.println("It is not a special 2-digit number");
    }
}
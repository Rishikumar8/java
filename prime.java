//WAP to check wheather a number is prime or not.
import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int n,count=0,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            if(n%i==0)
            count++;
            i++;
        }
        if(count == 2)
        System.out.println("Prime Number");
        else System.out.println("Not prime ");
    }
}
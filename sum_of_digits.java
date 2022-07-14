//WAP to find Sum of digits of a given number.
import java.util.Scanner;
class sum_of_digits
{
    public static void main(String agrs[])
    {
        int n,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        while(n>=1)
        {
            sum=sum+n%10;
            n/=10;
        }
        System.out.println("Sum of digits of number "+sum);
    }
}
//WAP to find sum of even & product of odd digits.
import java.util.Scanner;
class sum_of_even_and_pro_of_odd
{
    public static void main(String args[])
    {
        int n,sum=0,pro=1,digit;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        while(n>=1)
        {   digit=n%10;
            if(n%2==0)
            sum=sum+digit;
            else
             pro=pro*digit;
             n/=10;

        }
        System.out.println("sum of even numbers "+sum);
        System.out.println("product of even numbers "+pro);
    }
}
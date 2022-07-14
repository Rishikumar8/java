//WAP to find factorial of a given number.
import java.util.Scanner;
class fact
{
    public static void main(String args[])
    {
        int n,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        n=sc.nextInt();
        while(n>0)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial is "+fact);
    }
}
//WAP to find product of digit of a given number.
import java.util.Scanner;
class pro
{
    public static void main(String args[])
    {
        int n,product=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        while(n>0)
        {
            product=product*(n%10);
            n=n/10;
        }
        System.out.println("Product of digits "+product);
    }
}
//WAP to check wheather a number is palindrome or not.
import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        int n,rev=0,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        n=sc.nextInt();
        c=n;
        while(n>=1)
        {
            rev=(rev*10)+n%10;
            n/=10;
        }
        if(c==rev)
            System.out.println("Palindrome number");
            else System.out.println("Not palindrome");
    }
}
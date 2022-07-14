//Wap to find revese of a given number.
import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        int n,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        while(n>=1)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println("Reverse number is "+rev);
    }
}
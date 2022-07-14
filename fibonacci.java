//WAP to print fibonacci Series.
import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
    {
        int a=0,b=1,c=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of terms........");
        n=sc.nextInt();
        while(c<=n)
        {   System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
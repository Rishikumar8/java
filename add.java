import java.util.Scanner;
class add
{
    public static void main(String args[])
    {
        int a,b,c;
        System.out.println("Enter First Number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter Second Number:");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum of " + a+" and " +b +" is " +c);
    }
}
//WAP to check a number is odd or even.
import java.util.Scanner;
class evenodd
{
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A Number:");
        n=sc.nextInt();
        if(n%2==0)
        System.out.println("Even number");
        else System.out.println("Odd number");
        
    }
    
}
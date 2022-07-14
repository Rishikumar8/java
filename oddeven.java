//Check a number is odd or even without modulus operator
import java.util.Scanner;
class oddeven
{
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A Number:");
        n=sc.nextInt();
        if(n&1)
        System.out.println("odd NUmber");
        else System.out.println("Even Number");

        
    }
}

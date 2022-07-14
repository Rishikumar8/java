//WAP to print table of a given number.
import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A Number:");
        n=sc.nextInt();
        i=1;
        while(i<=10)
        {
            System.out.println((n*i));
            i++;
        }
    }
}
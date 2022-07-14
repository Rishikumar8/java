//WAAP to find between three numbers.
import java.util.Scanner;
class maxthree
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Three Numbers:");
  
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        System.out.println(a);
        else if(b>a && b>c)
        System.out.println(b);
        else System.out.println(c);
    }
}
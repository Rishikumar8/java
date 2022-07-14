//WAP to find sum of first "N" natural numbers.
import java.util.Scanner;
class sum_of_natural_no
{    public static void main(String agrs[])
     {
    int n,i,sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Value of N:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    sum=sum+i;
    System.out.println("Addition is "+sum);
     }
}

    
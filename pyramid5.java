//print 
/*
12345
1234
123
12
1
*/
import java.util.Scanner;
class pyramid5
{
    public static void main(String args[])
    {
        int n,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n=sc.nextInt();
        for(;n>=1;n--)
        {
            for(j=1;j<=n;j++)
            System.out.print(j);
             System.out.println();
            
        }
       
    }
}
//print 
/*

*/  
import java.util.Scanner;
class pyramid16
{
    public static void main(String args[])
    {
        int n,i,j,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(b=1;b<=n-i;b++)
            System.out.print(" ");
          
            for(j=1;j<=2*i-1;j++)
            System.out.print("*");
            
            System.out.println();

        }
        
       
     }
       
    }

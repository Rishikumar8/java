//print 
/*

*/  
import java.util.Scanner;
class pyramid20
{
    public static void main(String args[])
    {
        int n,i,j,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(b=1;b<=i;b++)
            System.out.print(" ");
          
            for(j=1;j<=2*(n-i)+1;j++)
            System.out.print(j);
            
            System.out.println();

        }
        
       
     }
       
    }

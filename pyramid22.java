//print 
/*

*/  
import java.util.Scanner;
class pyramid22
{
    public static void main(String args[])
    {
        int n,i,j,b,k=5;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(b=1;b<=i;b++)
            System.out.print(" ");
          
            for(j=1;j<=2*(n-i)+1;j++)
            System.out.print(k);
            k--;
            
            System.out.println();

        }
        
       
     }
       
    }

//print 
/*
11111
2222
333
44
5
*/
import java.util.Scanner;
class pyramid6
{
    public static void main(String args[])
    {
        int n,j,k=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        n=sc.nextInt();
        
        for(;n>=1;n--)
        {
            for(j=1;j<=n;j++)
            System.out.print(k);
            k++;
             System.out.println();
            
        }
       
    }
}
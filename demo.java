
import java.util.Scanner;
class demo
{
    public static void main(String args[])
    {  
         demo1 aa=new demo1();
         //aa.cube();
         //aa.Dcircle();
         aa.Ccircle();

    }
}
class demo1
{   
    void cube()
{
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number to find cube:");
    a=sc.nextInt();
    b=a*a*a;
    System.out.println(b);
}
   void Dcircle()
   {
       int D,r;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Radius:");
       r=sc.nextInt();
       D=2*r;

       System.out.println(D);
   }
    void Ccircle()
    {
        double A;
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius:");
        r=sc.nextInt();
        A=2*3.14*r;
        System.out.println(A);
    }
}

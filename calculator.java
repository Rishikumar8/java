//WAP to create simple calculator.
import java.util.Scanner;
class calculator
{
    public static void main(String args[])
    {
        int a,b,ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("1->addition ,2->Subtraction , 3->Multiplication , 4->Division");
        System.out.println("Enter Your Choice:");
        ch=sc.nextInt();
        if(ch==1)
        System.out.println("Addition is "+(a+b));
        else if(ch==2)
        System.out.println("Subtraction is "+(a-b));
        else if(ch==3)
        System.out.println("Multiplication is "+(a*b));
        else if(ch==4)
        System.out.println("Division is "+(a/b));
        else 
        System.out.println("Invalid choice");
    }
}
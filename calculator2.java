//WAP to create simple calculator.
import java.util.Scanner;
class calculator2
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
        switch(ch)
        {
            case 1:
            System.out.println("Addition is "+(a+b));
            break;
             case 2:
            System.out.println("Subtraction is "+(a-b));
            break;
             case 3:
            System.out.println("Multiplication is "+(a*b));
            break;
             case 4:
            System.out.println("Division is "+(a/b));
            break;
            default :
            System.out.println("Invalid Choice");

        }
    }

}
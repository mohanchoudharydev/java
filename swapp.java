import java.util.Scanner;
class Demo
{
    public static void main (String arr[])
    {
        int a,b;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two no . ");
        a = ob .nextInt();
        b = ob .nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swap=a="+a);
         System.out.println("b="   +b);
        
    }
}
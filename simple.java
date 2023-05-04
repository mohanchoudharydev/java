import java.util.*;
class  Demo
{
    public static void main(String arr[])
    {
        int pri,r,t;
        float result;

        Scanner ob= new Scanner(System.in);
        System.out.print("Enter principle Amount");
        pri = ob.nextInt();
        System.out.print("Enter rate presant");
        r = ob.nextInt();
        System.out.print("Enter  time ");
        t = ob.nextInt();
        result=p*r*t/100;
        System.out.println("result = " + result);
    }
}
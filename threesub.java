import java.util.Scanner;
class Main
{
    public static void main (String arr[])
    {
        int h,m,e,total;
        float per;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter hindi marks :");
        h = ob.nextInt();
        
        System.out.println("Enter hindi marks :");
        m = ob.nextInt();
        
        System.out.println("Enter hindi marks :");
        e = ob.nextInt();
        
        total=h+m+e;
        per=(total*100)/300;
        
        System.out.println("total marks : "+total);
        System.out.println("persantage : "+per);
    }
}
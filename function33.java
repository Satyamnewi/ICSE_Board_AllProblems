import java.util.*;
class function33
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,ch,r;
        double avg;
        System.out.println("Enter 2 no.s");
        a=in.nextInt();
        b=in.nextInt();
        function33 ob=new function33();
        System.out.println("Enter your choice ");
        System.out.println("1.SUM ");
        System.out.println("2.LARGEST ");
        System.out.println("3.AVERAGE ");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
            r=ob.sum(a,b);
            System.out.println("Sum is "+r);
            break;
            
            case 2:
            r=ob.largest(a,b);
            System.out.println("Largest is "+r);
            break;
            
            case 3:
            avg=ob.average(a,b);
            System.out.println("Average is "+avg);
            break;
            
            default:
            System.out.println("Invalid Choice");
        }
    }
    public int sum(int a,int b)
    {
        int r=0;
        r=a+b;
        return r;
    }
    public int largest(int a,int b)
    {
        int r=0;
        r=Math.max(a,b);
        return r;
    }
    public double average(int a,int b)
    {
        double avg=0;
        int s=a+b;
        avg=s/2;
        return avg;
    }
}
import java.util.*;
class function22
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 no.s");
        a=in.nextInt();
        b=in.nextInt();
        function22 ob=new function22();
        ob.sum(a,b);
    }
    public void sum(int x,int y)                     //PASS BY VALUE
    {
        int s=0;
        s=x+y;
        System.out.println("Sum is "+s);
    }
}
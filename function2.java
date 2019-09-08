import java.util.*;
class function2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int x[]=new int[5],i;
        System.out.println("Enter 5 no.s");
        function2 ob=new function2();
        for(i=0;i<5;i++)
        {
            x[i]=in.nextInt();
        }
        ob.findsum(x);
    }
    public void findsum(int a[])                     //PASS BY REFERRENCE
    {
        int i,s=0;
        for(i=0;i<5;i++)
        {
            s=s+a[i];
        }
        System.out.println("Sum is "+s);
    }
}
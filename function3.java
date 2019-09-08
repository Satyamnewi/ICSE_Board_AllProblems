import java.util.*;
class function3
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,f;
        System.out.println("Enter a no.");
        n=in.nextInt();
        function3 ob=new function3();
        f=ob.fact(n);
        System.out.println("Factorial is :"+f);
    }
    public int fact(int n)
    {
        int f=1,i;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}
        
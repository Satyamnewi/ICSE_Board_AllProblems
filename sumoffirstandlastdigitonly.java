import java.util.*;
class sumoffirstandlastdigitonly
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,div,dig=0,c=0;
        System.out.println("Enter a no.");
        n=in.nextInt();
        for(div=n;div>0;div/=10)
        {
            c++;
        }
        int p=(int)Math.pow(10,(c-1));
        int q=n/p;
        dig=n%10;
        int s=dig+q;
        System.out.println("Sum of first and last digit is: "+s);
    }
}
        
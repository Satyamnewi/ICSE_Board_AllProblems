import java.util.*;
class palprime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i,c=0,div,dig=0,r=0;
        System.out.println("Enter a no.");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        for(div=n;div>0;div/=10)
        {
            dig=div%10;
            r=(r*10)+dig;
        }
        if((c==2)&&(r==n))
        System.out.println("PAL-PRIME NUMBER");
        else
        System.out.println("NOT A PAL-PRIME NUMBER");
    }
}
        
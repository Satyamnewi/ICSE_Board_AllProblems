import java.util.*;
class perfectsquarecheck
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5],i,j;
        double sq=0.0,max=0;
        System.out.println("Enter 5 no.s");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<5;i++)
        {
            max=Math.max(a[i],max);
        }
        System.out.println("Perfect Squares are: ");
        for(i=0;i<5;i++)
        {
            sq=0.0;
            sq=Math.sqrt(a[i]);
            for(j=1;j<=max;j++)
            {
                if(sq==j)
                System.out.println(a[i]);
            }
        }
    }
}
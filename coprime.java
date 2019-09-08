import java.util.*;
class coprime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,i,cf=0;
        System.out.println("Enter 2 no.s");
        a=in.nextInt();
        b=in.nextInt();
        int min=Math.min(a,b);
        for(i=1;i<=min;i++)
        {
            if(a%i==0&&b%i==0)
            {
                cf=i;
            }
        }
        if((cf==1)&&(a-b==1||b-a==1))
        System.out.println("IT IS CO-PRIME ");
        else
        System.out.println("NOT CO-PRIME");
    }
}
        
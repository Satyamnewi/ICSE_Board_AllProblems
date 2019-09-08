import java.util.*;
class nopresentinfibonacci
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=0,b=1,c=0,i,s,f=0,p=0;
        System.out.println("Enter a no. to search");
        s=in.nextInt();
        for(i=1;i<=s;i++)
        {
            c=a+b;
            a=b;
            b=c;
            if(s==a)
            {
            f++;
            }
        }
        if(f!=0)
        System.out.println("Present");
        else
        System.out.println("Not present");
    }
}
            
        
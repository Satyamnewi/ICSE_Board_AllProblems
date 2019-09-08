import java.util.*;
class rankobatinedbystudents
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        String s[]=new String[5],tt;
        int i,j,t=0;
        System.out.println("Enter 5 no.s");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
            
        }
        for(i=0;i<5;i++)
        {
            s[i]=in.nextLine();
        }
        for(i=1;i<=4;i++)
        {
            for(j=0;j<5-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    
                    tt=s[j];
                    s[j]=s[j+1];
                    s[j+1]=tt;
                }
            }
        }
        System.out.println("NAMES  "+"\t"+"  ROLL");
        for(i=0;i<5;i++)
        {
            System.out.println(s[i]+"  "+"\t"+"  "+a[i]);
        }
    }
}
            
import java.util.*;
class selectionsort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,t=0,min=0;
        int m[]=new int[5];
        System.out.println("Enter 5 no.s");
        for(i=0;i<5;i++)
        {
            m[i]=in.nextInt();
        }
        for(i=0;i<4;i++)
        {
            min=i;
            for(j=i+1;j<5;j++)
            {
                if(m[min]>m[j])
                min=j;
            }
            t=m[i];
            m[i]=m[min];
            m[min]=t;
        }
        System.out.println("Sorted array is: ");
        for(i=0;i<5;i++)
        System.out.println(m[i]);
    }
}
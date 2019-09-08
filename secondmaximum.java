import java.util.*;
class secondmaximum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5],i,p=0,max=0,sm=0;
        System.out.println("Enter array elements");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(a[i]>max)
            {
                sm=max;
                max=a[i];
            }
            else if(a[i]>sm)
            {
                sm=a[i];
            }
        }
        System.out.println("Second Maximum is: "+sm);
    }
}
        
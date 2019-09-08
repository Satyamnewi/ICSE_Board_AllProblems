import java.util.*;
class InsertingElementAtAnyPosition
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[100];
        int n,t=0,i,p,s;
        System.out.println("Enter the size of the array");
        n=in.nextInt();
        System.out.println("Enter array elemets:");
        for(i=0;i<n;i++)
          a[i]=in.nextInt();
        System.out.println("Enter the element you want to enter: ");
        s=in.nextInt();
        System.out.println("Enter the position you want to get it entered: ");
        p=in.nextInt();
        t=a[p-1];
        a[p-1]=s;
        for(i=0;i<=n-1-p;i++)
        {
            a[n-i]=a[n-1-i];
        }
        a[p]=t;
        System.out.println("The shifted Array after inserting is: ");
        for(i=0;i<=n;i++)
        System.out.print(a[i]+"  ");
    }
}
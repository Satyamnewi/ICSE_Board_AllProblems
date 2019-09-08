import java.util.*;
class constructorarray
{
    int a[];
    constructorarray(int x[])
    {
        a=x;
    }
    void display()
    {
        int s=0,i;
        for(i=0;i<5;i++)
        {
            s=s+a[i];
        }
        System.out.println("Sum is: "+s);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5],i;
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        constructorarray ob=new constructorarray(a);
        ob.display();
    }
}
        
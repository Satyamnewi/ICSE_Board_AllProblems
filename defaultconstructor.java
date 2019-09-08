import java.util.*;
class defaultconstructor
{
    int a,b;
    defaultconstructor()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 2 no.s");
        a=in.nextInt();
        b=in.nextInt();
    }
    void display()
    {
        int p=0;
        p=a*b;
        System.out.println("Product is: "+p);
    }
    public static void main(String args[])
    {
        defaultconstructor ob=new defaultconstructor();
        ob.display();
    }
}
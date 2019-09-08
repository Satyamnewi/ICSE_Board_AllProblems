import java.util.*;
class constructor
{
    int a,b,c;
    constructor(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void display()
    {
        int l=0;
        l=a;
        if(b>l)
        l=b;
        if(c>l)
        l=c;
        System.out.println("Largest is: "+l);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 no.s ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        constructor ob=new constructor(a,b,c);
        ob.display();
    }
}

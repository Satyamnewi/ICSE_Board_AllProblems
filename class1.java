import java.util.*;
class class1
{
    int a,b;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 2 no.s");
        a=in.nextInt();
        b=in.nextInt();
    }
    void display()
    {
        int s=0;
        s=a+b;
        System.out.println("Sum is: "+s);
    }
    public static void main(String args[])
    {
        class1 ob=new class1();
        ob.accept();
        ob.display();
    }
}
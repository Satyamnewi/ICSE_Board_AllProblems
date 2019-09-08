import java.util.*;
class overload
{
    public double area(double r)
    {
        double aa=0.0;
        aa=22/7*r*r;
        return aa;
    }
    public int area(int s)
    {
        int a=0;
        a=s*s;
        return a;
    }
    public int area(int l,int b)
    {
        int ra=0;
        ra=l*b;
        return ra;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ch;
        overload ob=new overload();
        System.out.println("1.Area of circle ");
        System.out.println("2.Area of square ");
        System.out.println("3.Area of rectangle ");
        System.out.println("Enter your choice");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter radius");
            double r=in.nextDouble();
            double aa=ob.area(r);
            System.out.println("Area of circle "+aa);
            break;
            
            case 2:
            System.out.println("Enter side");
            int s=in.nextInt();
            int a=ob.area(s);
            System.out.println("Area of square "+a);
            break;
            
            case 3:
            System.out.println("Enter length and breadth");
            int l=in.nextInt();
            int b=in.nextInt();
            int ra=ob.area(l,b);
            System.out.println("Area of rectangle "+ra);
            break;
            
            default:
            System.out.println("Invalid Choice");
        }
    }
}
            
        
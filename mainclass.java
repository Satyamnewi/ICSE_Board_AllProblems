import java.util.*;
class mainclass
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int x,y;
        System.out.println("Enter 2 no.s ");
        x=in.nextInt();
        y=in.nextInt();
        classwithparameter ob=new classwithparameter();
        ob.accept(x,y);
        ob.display(); 
    }
}
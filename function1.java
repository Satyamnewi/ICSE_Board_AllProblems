import java.util.*;
class function1
{
    public void pattern()
    {
        int i,j,sp=4;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            sp--;
        }
    }
    public static void main(String args[])
    {
        function1 ob=new function1();
        ob.pattern();
    }
}
       
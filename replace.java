import java.util.*;
class replace
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,s1="";
        System.out.println("Enter String");
        s=in.nextLine();
        int l=s.length();
        char ch;
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='e')
            {
                s1=s1+'t';
            }
            else
            {
                s1=s1+ch;
            }
        }
        System.out.println("Result is "+s1);
    }
}
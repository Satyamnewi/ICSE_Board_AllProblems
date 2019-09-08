import java.util.*;
class removevowel
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,s1="";
        System.out.println("Enter String");
        s=in.nextLine();
        int l=s.length();
        int i;
        char ch;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
            {
                s1=s1+ch;
            }
        }
        System.out.print("New String "+s1);
    }
}
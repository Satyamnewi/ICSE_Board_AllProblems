import java.util.*;
class frequencyofwordscharacter
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("Enter String in UpperCase");
        s=in.nextLine();
        int i,j,c=0,ss=0;
        char ch,ch1;
        int l=s.length();
        for(j=65;j<=90;j++)
        {
            c=0;
            for(i=0;i<l;i++)
            {
                ch=s.charAt(i);
                ss=(int)ch;
                if(ss==j)
                c++;
            }
        ch1=(char)j;
        if(c!=0)
        System.out.println("Frequency of "+ch1+ " is: "+c);
    }
}
}

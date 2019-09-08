import java.util.*;
class countpallindromewords
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,s1="",r="";
        char ch,ch1;
        int i,j,l=0,l2=0,c=0;
        System.out.println("Enter String");
        s=in.nextLine()+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                s1=s1+ch;
            }
            else
            {
                l2=s1.length();
                for(j=l2-1;j>=0;j--)
                {
                    ch1=s1.charAt(j);
                    r=r+ch1;
                }
                if(r.equalsIgnoreCase(s1))
                c=c+1;
                s1="";
                r="";
            }
        }
        System.out.println("No.of paliindrom words: "+c);
    }
}
                    
        
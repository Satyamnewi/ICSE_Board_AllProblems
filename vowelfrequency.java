import java.util.*;
class vowelfrequency
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("Enter String in UpperCase");
        s=in.nextLine();
        int i,j,c=0;
        char ch,ch1;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                for(j=0;j<s.length();j++)
                {
                    ch1=s.charAt(j);
                    if(ch==ch1)
                    {
                        c++;
                    }
                    
                }
                System.out.println("Frequency of "+ch+" is "+c+" time ");
                c=0;
            }
        }
    }
}
                
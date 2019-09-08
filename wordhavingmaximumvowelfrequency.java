import java.util.*;
class wordhavingmaximumvowelfrequency
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,w="",s1="",v="";
        System.out.println("Enter String");
        s=in.nextLine()+" ";
        int i,l=0,l2=0,j,c=0,max=0;
        char ch,ch1;
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                l2=w.length();
                c=0;
                for(j=0;j<l2;j++)
                {
                    ch1=w.charAt(j);
                    if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
                    c++;
                }
                if(c>max)
                max=l2;
                v=w;
                w="";
            }
        }
        System.out.println("Word with maximum vowel : "+v);
    }
}
                    
                    


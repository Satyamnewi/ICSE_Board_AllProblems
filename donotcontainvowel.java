import java.util.*;
class donotcontainvowel
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,w="",r="";
        int i,l=0,l2=0,j;
        char ch,ch1;
        System.out.println("Enter a String ");
        s=in.nextLine()+" ";
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
               for(j=0;j<l2;j++)
               {
                   ch1=w.charAt(j);
                   if(!(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'))
                   {
                       r=w;
                       break;
                    }
               }
               w="";
            }
        }
        System.out.println("OUTPUT IS :"+r);
    }
}
                       
    
import java.util.*;
class longest
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        String s,s1="",s11="",word="",lw="";
        System.out.println("Enter String");
        s=in.nextLine();
        int i,l=0,wl=0,mx=0;
        char ch;
        s1=s+" ";
        l=s1.length();
        for(i=0;i<l;i++)
        {
            ch=s1.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
               wl=word.length();
               if(wl>mx)
               {
                   mx=wl;
                   lw=word;
               }
               lw="";
               word="";
            }
        }
        System.out.println("Longest word length is "+mx);
        }
     }
        
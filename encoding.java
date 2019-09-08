import java.util.*;
class encoding
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String ");
        String s=in.nextLine();
        char ch,ch1;
        int i,l=0,c=0;
        l=s.length();
        String s1="";
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if((ch>='d'&&ch<='z')||(ch>='D'&&ch<='Z'))
                c=(int)(ch-3);
            else if(ch=='a'||ch=='b'||ch=='c'||ch=='A'||ch=='B'||ch=='C')
                c=(int)(ch+23);
                
                ch1=(char)(c);
                s1=s1+ch1;
            }
        System.out.println("New String is: "+s1);
    }
}
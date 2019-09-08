import java.util.*;
class eliminatingword
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,w="",s1="";
        System.out.println("Enter String");
        s=in.nextLine()+" ";
        int i,l=0,wl=0,j;
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
                    if(!(w.equals("THE")))
                    s1=s1+" "+w;
                    w="";
            }
        }
        System.out.println("Result is "+s1);
    }
}
                    
                    


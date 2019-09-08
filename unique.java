import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s="";
        System.out.println("Enter a String");
        s=in.nextLine();
        char ch,ch1;
        int i,j;
        boolean f=false;
        int l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            f=false;
            for(j=i-1;j>=0;j--)
            {
                ch1=s.charAt(j);
                if(ch==ch1)
                {
                   f=true;
                   break;
                }
            }
        }
        if(!f)
        System.out.println("UNIQUE");
        else
        System.out.println("NOT UNIQUE ");
    }
}
                
            
                
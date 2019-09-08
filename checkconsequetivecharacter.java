import java.util.*;
class checkconsequetivecharacter
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string");
        String s=in.nextLine();
        char ch,ch1;
        int i,l=0;
        l=s.length();
        System.out.println("Consequetive characters are :");
        for(i=0;i<l-1;i++)
        {
            ch=s.charAt(i);
            ch1=s.charAt(i+1);
            if((int)ch==(int)ch1-1)
            System.out.println(ch+","+ch1);
        }
    }
}
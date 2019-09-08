import java.util.*;
class arrangecharactersinalphabeticalorder
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String");
        String s=in.nextLine();
        int i,j,l=0;
        char ch;
        l=s.length();
        for(i=65;i<=90;i++)
        {
            for(j=0;j<l;j++)
            {
                ch=s.charAt(j);
                if(ch==(char)i||ch==(char)(i+32))
                System.out.print(ch);
            }
        }
    }
}
import java.util.*;
class frequencyofvowel
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("Enter String in UpperCase");
        s=in.nextLine();
        int i,c=0,cc=0,d=0,dd=0,e=0;
        char ch;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='A')
            c++;
            else if(ch=='E')
            cc++;
            else if(ch=='I')
            d++;
            else if(ch=='O')
            dd++;
            else if(ch=='U')
            e++;
        }
        System.out.println("A occurs "+c+" times");
        System.out.println("E occurs "+cc+" times");
        System.out.println("I occurs "+d+" times");
        System.out.println("O occurs "+dd+" times");
        System.out.println("U occurs "+e+" times");
    }
}
        
                
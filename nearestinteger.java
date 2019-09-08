import java.io.*;
class nearestinteger
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        double a;
        System.out.println("Enter a no.");
        a=Double.parseDouble(in.readLine());
        double c=Math.ceil(a);
        double f=Math.floor(a);
        double m=(c+f)/2;
        if(a>=m)
        System.out.println(c);
        else
        System.out.print(f);
    }
}
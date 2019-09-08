import java.io.*;
class ternary
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int a,b,l=0;
        System.out.println("Enter two numbers");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        l=(a>b)?a:b;
        System.out.println("Largest is "+l);
    }
}
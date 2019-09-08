import java.io.*;
class loop
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,n,t=2;
        System.out.println("enter the term");
        n=Integer.parseInt(in.readLine());
        for(i=2;i<=n;i++)
        {
           System.out.print(t*t+" ");
           t=t+2;
        }
}
}
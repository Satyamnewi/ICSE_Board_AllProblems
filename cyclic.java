import java.io.*;
class cyclic
{
    public static void main(String args[])throws IOException
    {
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int a[]=new int[10],i;
       int b[]=new int[10];
       System.out.println("Enter 10 elements");
       for(i=0;i<10;i++)
       {
           a[i]=Integer.parseInt(in.readLine());
       }
       b[0]=a[9];
       for(i=0;i<9;i++)
       {
           b[i+1]=a[i];
       }
       for(i=0;i<10;i++)
       System.out.println(b[i]);
    }
}
        

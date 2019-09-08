import java.io.*;
class checkprime
{
   public static void main(String args[])throws IOException
   {
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int n,i,c=0,j;
       System.out.println("Enter the value of n ");
       n=Integer.parseInt(in.readLine());
       for(i=1;i<=n;i++)
       {
           c=0;
           for(j=1;j<=i;j++)
           {
               if(i%j==0)
               c++;
           }
           if(c==2)
           System.out.println(i);
        }
    }
}
            
           
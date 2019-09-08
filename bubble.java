import java.io.*;
class bubble
{
    public static void main(String args[])throws IOException
    {
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int a[]=new int[10],i,j,t=0;
       System.out.println("Enter 10 array elements");
       for(i=0;i<10;i++)
       {
           a[i]=Integer.parseInt(in.readLine());
       }
       for(i=1;i<=9;i++)
       {
           for(j=0;j<10-i;j++)
           {
               if(a[j]>a[j+1])
               {
                   t=a[j];
                   a[j]=a[j+1];
                   a[j+1]=t;
               }
            }
       }
       for(i=0;i<10;i++)
       {
           System.out.println(a[i]);
        }
    }
}
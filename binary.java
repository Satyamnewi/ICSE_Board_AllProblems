import java.io.*;
class binary
{
    public static void main(String args[])throws IOException
    {
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int a[]=new int[10],i,s=0,first=0,last=0,mid=0,p=0;
       System.out.println("Enter elements");
       for(i=0;i<10;i++)
       {
       a[i]=Integer.parseInt(in.readLine());
       }
       System.out.println("Enter element to search");
       s=Integer.parseInt(in.readLine());
       first=0;
       last=9;
       p=0;
       while(first<=last&&p==0)
       {
           mid=(first+last)/2;
           if(a[mid]==s)
                p=mid+1;
           else if(s>a[mid])
                first=mid+1;
           else
                last=mid-1;
       }
       if(p==0)
          System.out.println("Sorry not Found");
       else
          System.out.println("Found at "+p);
        }
    }

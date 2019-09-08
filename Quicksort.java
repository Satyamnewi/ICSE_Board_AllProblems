import java.util.*;
class Quicksort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size: ");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements: ");
        for(i=0;i<n;i++)
        a[i]=in.nextInt();
        Quicksort ob=new Quicksort();
        ob.QuicklySort(a,0,n-1);
    }
    void QuicklySort(int a[],int low,int high)
    {
        int pivot,i,j,t=0;
        if(low<high)
        {
            i=low;
            pivot=a[i];
            j=high;
            while(i<j)
            {
                for(;pivot>=a[i]&&i<=high;)
                i++;
                for(;pivot<a[j]&&j>=i;)
                j--;
                if(i<j)
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
            t=pivot;
            pivot=a[j];
            a[j]=t;
            QuicklySort(a,low,j-1);
            QuicklySort(a,j+1,high);
        }
    }
}
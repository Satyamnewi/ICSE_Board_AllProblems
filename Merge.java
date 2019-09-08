import java.util.*;
class Merge
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
        Merge ob=new Merge();
        ob.MidSort(a,0,n-1);
        System.out.println("After sorting : ");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
    void MidSort(int a[],int lb,int ub)
    {
        int mid;
        if(lb<ub)
        {
            mid=(lb+ub)/2;
            MidSort(a,lb,mid);
            MidSort(a,mid+1,ub);
            MergeSort(a,lb,mid,ub);
        }
    }
    void MergeSort(int a[],int lb,int mid,int ub)
    {
        int i,j,k=0;
        int c[]=new int[20];
        i=k=lb;
        j=mid+1;
        for(;i<=mid&&j<=ub;)
        {
               if(a[i]<a[j])
                  c[k++]=a[i++];
               else
                  c[k++]=a[j++];
        }
        for(;i<=mid;)
            c[k++]=a[i++];
        for(;j<=ub;)
            c[k++]=a[j++];
        for(i=0;i<k;i++)
        a[i]=c[i];
    }
}
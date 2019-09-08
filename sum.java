class sum
{
    public static void main(String args[])
    {
        int p=12;
        int r=4*(--p)+(p++);
        System.out.println("Result is "+r);
        
        int r2=(p--)*(p++);
        System.out.println("Result is "+r2);
        
        int q=10;
        q-=q+++--q;
        System.out.println("Result is "+q);
        
        int a=1000,b=10,c=1;
        do
        {
            a=a/b;
            c=c+1;
        }
        while(b<=a);
        System.out.println("The answer :"+c);
        
        int m=7,n=4,pp=2;
        m-=m/n+(pp--)*(pp++);
        System.out.println("Result is "+m);
    }
}
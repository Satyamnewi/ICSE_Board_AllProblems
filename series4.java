class series4
{
    public static void main(String args[])
    {
        int i,s=0;
        for(i=1;i<10;i++)
        {
            System.out.print((i*i-1)+" ");
            s=s+(i*i-1);
        }
        System.out.println("Sum is :"+s);
    }
}
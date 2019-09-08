class series3
{
    public static void main(String args[])
    {
        int i,j,s=0;                                     //10-1+9-2+8-3........+1-10
        for(i=10,j=1;i>=1;i--,j++)
        {
            s=s+i+(-1)*j;
        }
        System.out.println("Sum is: "+s);
    }
}
            
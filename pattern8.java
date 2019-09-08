class pattern8
{
    public static void main(String args[])
    {
        int i,j,sp=0;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            sp=sp+2;
        }
    }
}
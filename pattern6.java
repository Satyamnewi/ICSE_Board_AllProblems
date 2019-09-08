class pattern6
{
    public static void main(String args[])
    {
        int i,j,sp=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            sp++;
        }
    }
}
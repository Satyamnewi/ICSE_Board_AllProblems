class PatternAvi
{
    public static void main(String args[])
    {
        int i,j,sp=4;
        for(i=1;i<=5;i++)
        {
            System.out.println();
            for(j=1;j<=sp;j++)
            System.out.print("  ");
            sp--;
            for(j=1;j<=i;j++)
            System.out.print("* ");
        }
    }
}
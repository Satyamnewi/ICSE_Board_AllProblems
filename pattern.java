class pattern
{
    public static void main(String args[])
    {
        int i,j,sp=0,sp2=8;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
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
            for(i=1;i<=5;i++)
            {
                for(j=1;j<=i;j++)
                {
                   System.out.print(j+" ");
                }
                for(j=1;j<=sp2;j++)
                {
                    System.out.print(" ");
                }
                for(j=i;j>=1;j--)
                {
                    System.out.print(j);
                }
            System.out.println();
            sp2=sp2-2;
        }
    }
}


                

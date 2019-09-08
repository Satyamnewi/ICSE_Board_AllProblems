class patern
{
    public static void main(String args[])
    {
        String s="WATER";
        int i,j;
        for(i=4;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
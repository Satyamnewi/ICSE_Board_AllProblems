class func2
{
    public static void main(String args[])
    {
        int a=5,b=10,c=6;
        c=c*(a-- +b++)+2*++a;
        System.out.println(c);
        
        double r=Math.rint(Math.abs(-14.5));
        System.out.println("Result of rint function "+r);
        
        long k=Math.round(15.3);
        System.out.println("Result of round function is: "+k);
        
        String s=" Satyam Pathak ";
        String s1=s.trim();
        System.out.println("Result is "+s1);
        
        char ch='A';
        System.out.println(--ch);
    }
}
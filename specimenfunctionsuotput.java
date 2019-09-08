class specimenfunctionsuotput
{
    public static void main(String args[])
    {
        int a[]={2,3,2,11,5},l=0,ls=0;
        String s="Computer";
        l=a.length;
        ls=s.length();
        System.out.println("length of array="+l+"    length of String="+ls);
        
        double c=+9.999999;
        double r=Math.abs(c);
        System.out.println("Result of absolute function="+r);
        
        double n=41.5;
        double r2=Math.round(n);
        System.out.println("Result of round off function="+r2);
        
        boolean p,q;
        p=("BlueJ".length()>"ABCDE".length())?true:false;
        System.out.println("Answer of boolean type="+p);
        
        char pp='B';
        int aa=14;
        char m='b';
        double b=19.99;
        System.out.println((int)pp+aa);
        System.out.println((int)m+b);
        System.out.println("The Answer:"+aa+b);
        System.out.println("The Answer:"+(aa+b));
        
        int val=1600,sum=0,no=550;
        sum=no+val>1750?400:200;
        System.out.println(sum);
        
        int x=1,y=1,nn=1;
        if(nn>0)
        {
            x=x+1;
            y=y+1;
        }
        System.out.println("Value of x= "+x+" Value of y= "+y);
        
                                 //SPECIMEN QUESTION BASED ON OUTPUT PREDICTIONS
        int z=0,v=20,w=10;       //Q.2.B
        z =++v *(w--)-w;
        System.out.println("Expression Result="+z);
        
        double result=2-10*3+100/11;               //Q.1.E
        System.out.println("Result of snippet is ="+result);
        
        String ss="application";                    //Q.3.C(i)
        int ppp=ss.indexOf("a");
        System.out.println(ppp);
        System.out.println(ppp+ss);
        
        int aaaa=0;                                 //Q.3.c(iii)
        if(aaaa>0 && aaaa<20)
          aaaa++;
        else 
          aaaa-- ;
        System.out.println(aaaa);
        
        int a5=5,b5=2,c5=0;                         //Q.3.c(iv)
        if (a5>b5||a5!=b5)
          c5=++a5+--b5;
        System.out.print(c5+ " "+a5+" "+b5);
        
        int i=1;                                    //Q.3.c(v)
        while(i++<=1)
        {
           i++;
           System.out.println("       "+i+" ");
        }
        System.out.print("Result of the expression is="+i);
    }
}
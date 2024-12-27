package java_grooming;

public class fibonacci 
{

	 static void fib(int no) 
	 {
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=no;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	 }
		
      public static void main(String[]args)
      {
    	  fib(10);
      }


}

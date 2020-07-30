import java.io.*;
import java.util.*;
class GFG 
{
	public static void main (String[] args) 
  {    
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		
		while(testcases-->0)
		{
		    long n=sc.nextLong();
		    long smaller;
		    long greater;
		
		    if(Geeks.isPerfectSquare(n)==true)
		    {
		        smaller=(long)Math.sqrt(n)-1;
		        greater=(long)Math.sqrt(n)+1;
		    }
		    else
		    {
		        smaller=(long)Math.floor(Math.sqrt(n));
		        greater=(long)Math.ceil(Math.sqrt(n));
		    }
		    
		    if((long)Math.abs(smaller*smaller-n)<(long)Math.abs(greater*greater-n))
		        System.out.println(smaller*smaller);
		    else
		        System.out.println(greater*greater);
		}
	}
}
class Geeks
{
    public static boolean isPerfectSquare(long number)
    {
        long root=(long)Math.sqrt(number);
        return root*root==number;
    }
}

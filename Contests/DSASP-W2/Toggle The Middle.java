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
		    
		    int numberOfBits=1+(int)Math.floor(Math.log(n)/Math.log(2)); //finding number of bits
        
            if(numberOfBits%2!=0) //if bits are odd
            {
                n=n^(1<<(numberOfBits/2)); 
            }
            else //else if bits are even
            {
                n=n^(1<<(numberOfBits/2));
                n=n^(1<<((numberOfBits/2)-1));
            }
            System.out.println(n);
		}
	}
}

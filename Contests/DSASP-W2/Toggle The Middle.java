import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.*; 

class GFG { 
	static int evenbittogglenumber(int n) 
	{ 

		int res = 0, count = 0; 
		for (int temp = n; temp > 0; 
							temp >>= 1) 
		{ 
			if (count % 2 == 1) {
				res |= (1 << count);}	 
			count++; 
		} 

		return n ^ res; 
	} 
	
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(evenbittogglenumber(n)); 
	} 
} 

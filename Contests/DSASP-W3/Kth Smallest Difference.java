import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{ 
	static int countPairs(int[] a, int n, int mid) 
	{ 
		int res = 0, value; 
		for(int i = 0; i < n; i++) 
		{ 
			int ub = upperbound(a, n, a[i]+mid); 
			res += (ub- (i-1)); 
		} 
		return res; 
	} 
	static int upperbound(int a[], int n, int value) 
	{ 
		int low = 0; 
		int high = n; 
		while(low < high) 
		{ 
			final int mid = (low + high)/2; 
			if(value >= a[mid]) 
				low = mid + 1; 
			else
				high = mid; 
		} 

	return low; 
	} 
	static int kthDiff(int a[], int n, int k) 
	{ 
		Arrays.sort(a); 
		int low = a[1] - a[0]; 
		for (int i = 1; i <= n-2; ++i) 
			low = Math.min(low, a[i+1] - a[i]); 

		int high = a[n-1] - a[0]; 

		while (low < high) 
		{ 
			int mid = (low + high) >> 1; 
			if (countPairs(a, n, mid) < k) 
				low = mid + 1; 
			else
				high = mid; 
		} 
		return low; 
	} 
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in); 
		int k = sc.nextInt();
		int m = sc.nextInt();
		//int a[] = {1,3,4,1,3,8};
		int a[] = new int[m];
		int n = a.length; 
		for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
		System.out.println(kthDiff(a, n, k)); 
	} 
} 

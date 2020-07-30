import java.util.*;
import java.lang.*;
import java.io.*;
class GFG 
{    
    public static long kSum(int arr[], int n, int k){
        Arrays.sort(arr);
        long res = 0;
        for(int i=0; i<k; i++)res+=arr[i];
        return res;
    } 
	public static void main (String[] args) throws IOException 
  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    int[] arr = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    System.out.println(kSum(arr, n, k));
		}
	}
}

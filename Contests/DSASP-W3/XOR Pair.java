import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    public static boolean XORPair(int arr[], int n, int c){
        Set<Integer> st = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            st.add(arr[i]);
        }
        boolean flag = false;
        for(int i=0; i<n && !flag; i++){
            if(st.contains(arr[i]^c))flag = true;
        }
        if(flag)return true;
        return false;
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
		    if(XORPair(arr, n, k)){
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}

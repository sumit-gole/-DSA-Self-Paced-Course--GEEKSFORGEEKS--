import java.util.*;
import java.lang.*;
import java.io.*;
public class GFG
{
    public static int maxSum(int a[], int start, int end) 
    {
        int maxSum = 0;
        if (start == end) {
            return a[start];
        } else if (start > end) {
            return 0;
        } else if (end - start == 1) {
            return a[start] > a[end] ? a[start] : a[end];
        } else if (start < 0) {
            return 0;
        } else if (end >= a.length) {
            return 0;
        }

        for (int i = start; i <= end; i++) 
        {
            int possibleMaxSub1 = maxSum(a, i + 2, end);
            int possibleMaxSub2 = maxSum(a, start, i - 2);
            int possibleMax = possibleMaxSub1 + possibleMaxSub2 + a[i];
            if (possibleMax > maxSum) 
            {
                maxSum = possibleMax;
            }
        }
        return maxSum;
    }

    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        for(int j = 0; j<m; j++)
        {
            int n;
            n = s.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                a[i] = s.nextInt();
                System.out.print(maxSum(a, 0, a.length - 1));
                System.out.print(" ");
            }
        }
    }
}

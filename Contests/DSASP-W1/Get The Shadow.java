import java.util.*;
import java.io.*;
import java.lang.*;
class GFG
{
    static int a[] = new int[1000001];
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            for(int i = 0; i < n; i++)
              a[i]=  sc.nextInt();
              
            for(int i = 0; i < n; i++)
            {
                if(a[Math.abs(a[i])-1]>0)
                  a[Math.abs(a[i])-1] = -a[Math.abs(a[i])-1];
                  else
                    System.out.print(Math.abs(a[i]) + " ");
            }
            
            for(int i = 0; i < n; i++)
            {
                if(a[i] >0)
                  System.out.println(i+1);
            }
        }
    }   
}

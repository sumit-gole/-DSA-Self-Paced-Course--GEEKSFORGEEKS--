import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static int averageValue(String s) 
    { 
        int sum_char = 0; 
        for (int i = 0; i < s.length(); i++) 
        { 
            sum_char += (int)s.charAt(i); 
        } 
        return sum_char / s.length(); 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s="";
        for(int i = 0; i < n; i++)
        {
            s = sc.next();
            System.out.println(averageValue(s));
        }
    }   
}

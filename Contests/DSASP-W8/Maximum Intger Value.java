import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG 
{
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());
        while(T-- > 0) 
        {
            String str = scan.nextLine();
            maxValue(str);
        }
    }
    static void maxValue(String str) 
    {
        long maxNumber = 0;
        for(int i = 0; i < str.length(); i++) 
        {
            int n = Character.getNumericValue(str.charAt(i));
            if (maxNumber == 0 || maxNumber == 1 || n == 0 || n == 1) 
            {
                maxNumber += n;
            } 
            else 
            {
                maxNumber *= n;
            }
        }
        System.out.println(maxNumber);
    }
}

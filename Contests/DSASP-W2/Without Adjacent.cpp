#include<bits/stdc++.h>
using namespace std;
long long arr[11000001];
long long FindMaxSum(int n) 
{ 
    long long incl_prev = arr[0]; 
    long long excl_prev = 0; 
    long long incl_curr = 0; 
    long long excl_curr = 0;
    int i; 

    for (i = 1; i < n; i++) 
    { 
    
    	excl_curr = max(incl_prev, excl_prev); 
    
    	incl_curr = excl_prev + arr[i]; 
    
    	incl_prev = incl_curr; 
    	excl_prev = excl_curr; 
    } 
    return max(incl_curr, excl_curr);
} 

int main() 
{ 
    int t;
    cin >> t;
    while(t--)
    {
        int n;
        cin >> n;
        for(int i = 0;i<n;i++)
        {
            cin >> arr[i];
        }
        
        if(n == 1)
        cout << arr[0] << endl;
        else cout << FindMaxSum(n) << endl; 
    }
    return 0; 
}

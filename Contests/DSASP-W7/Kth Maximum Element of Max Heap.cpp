#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
int KthLargest(int arr[],int n,int k){
    // Your code here
    priority_queue<int> PQ(arr,arr+n);
    
    for(int i=0;i<k-1;i++)
    PQ.pop();
    
    return PQ.top();
}

// { Driver Code Starts.

int main() {
	
	int t;
	cin >> t;
	
	while(t--){
	    int n, k;
	    cin >> n >> k;
	    
	    int arr[n];
	    for(int i = 0;i<n;i++)
	        cin >> arr[i];
	    
	    cout << KthLargest(arr, n, k) << endl;
	}
	
	return 0;
}  // } Driver Code Ends

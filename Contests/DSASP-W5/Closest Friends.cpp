#include<bits/stdc++.h>
using namespace std;

int main(){

    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        stack<int> s;
        for(int i=0;i<n;i++){
            while(!s.empty()&&a[s.top()]>=a[i]){
                s.pop();
            }
            if(!s.empty()){
                cout<<s.top()<<" ";
            }
            else{
                cout<<-1<<" ";
            }
            s.push(i);
        }
        cout<<endl;
    }
    return 0;
}

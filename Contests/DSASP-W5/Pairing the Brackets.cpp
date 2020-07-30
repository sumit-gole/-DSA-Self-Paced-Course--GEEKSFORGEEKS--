#include<bits/stdc++.h>
using namespace std;

#define fi first
#define se second
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        vector<pair<int,int> > ans;
        queue<int> q;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='(') q.push(i);
            else
            {
                if(!q.empty())
                {
                    int val=q.front();
                    q.pop();
                    ans.push_back(make_pair(val,i));
                }
            }
        }
        cout<<ans.size()<<endl;
        for(auto it:ans){
            cout<<it.fi<<" "<<it.se<<endl; 
        }
    }
    return 0;
}

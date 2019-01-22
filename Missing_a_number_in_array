#include <iostream>
#include "vector"

using namespace std;
int main() {
    int t = 0, len = 0, sub = 0, sum = 0;
    vector<int> vector;
    cin >> t;
    for(int i=0;i<t;i++){
        cin >> len;
        int sum = 0;
        for(int j=1;j<len;j++){
            int aux = 0;
            cin >> aux;
            vector.push_back(aux);
        }

        for(int x=0;x<vector.size();x++){
            sum = sum + vector[x];
        }

        int n = vector.size()+1;
        int tot = (n*(n+1))/2;

        cout << tot-sum << endl;
        vector.clear();
    }


}

/*
 *
 * Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9
 */

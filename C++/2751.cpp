#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

// 전역변수
/*
int arr[1000000];

int main()
{
    int n;
    cin >> n;

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    sort(arr, arr + n);

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << '\n';
    }
    return 0;
}

*/

// 벡터
int main()
{
    int n, temp;
    cin >> n;
    vector<int> v;

    for (int i = 0; i < n; i++)
    {
        cin >> temp;
        v.push_back(temp);
    }

    sort(v.begin(), v.end());
    
    for (int i = 0; i < n; i++)
    {
        cout << v[i] << '\n';
    }
    return 0;
}

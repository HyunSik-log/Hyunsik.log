#include <iostream>
#include <algorithm>
using namespace std;

int n, m;
int arr[1000000];

void search(int sum)
{
    int first = 0;
    int last = n - 1;
    int mid;

    while (last >= first)
    {
        mid = (first + last) / 2;

        if (arr[mid] == sum)             // sum이 배열의 중앙
        {
            cout << 1 << '\n';
            return;
        }
        else if (arr[mid] > sum)         // sum이 배열의 중앙보다 작을때
            last = mid - 1;
        else
            first = mid + 1;             // sum이 배열의 중앙보다 클때
    }
    cout << 0 << '\n';
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    cin >> n;
    int temp;

    for (int i = 0; i < n; i++)
    {
        cin >> temp;
        arr[i] = temp;
    }

    sort(arr, arr + n);
    cin >> m;

    for (int i = 0; i < m; i++)
    {
        cin >> temp;
        search(temp);
    }
    return 0;
}

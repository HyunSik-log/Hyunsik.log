#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

bool compare(pair<int, string> a, pair<int, string> b)
{
    return a.first < b.first;
}

int main()
{
    int n;
    int age;
    string name;
    cin >> n;
    vector<pair<int, string>> v;
    for (int i = 0; i < n; i++)
    {
        cin >> age >> name;
        v.push_back({age, name});
    }
    stable_sort(v.begin(), v.end(), compare);
    for (int i = 0; i < n; i++)
    {
        cout << v[i].first << '\n' << v[i].second << '\n';
    }
    return 0;
}

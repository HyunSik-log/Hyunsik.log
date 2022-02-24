#include <iostream>
#include <algorithm>
using namespace std;

int alphabet(string abc, string xyz)
{
    if (abc.length() == xyz.length())
        return abc < xyz;
    else
        return abc.length() < xyz.length();
}

/*sort(arr, arr+n);

sort(v.begin(), v.end());

sort(v.begin(), v.end(), compare);                //사용자 정의 함수 사용

sort(v.begin(), v.end(), greater<자료형>());    //내림차순 (Descending order)

sort(v.begin(), v.end(), less<자료형>());        //오름차순 (default = Ascending order)
*/

string str[20000];

int main()
{
    int n;
    cin >> n;

    for (int i = 0; i < n; i++)
    {
        cin >> str[i];
    }
    sort(str, str + n, alphabet);

    for (int i = 0; i < n; i++)
    {
        if (str[i] == str[i - 1])     //중복 출력
            continue;

        cout << str[i] << '\n';
    }
    return 0;
}

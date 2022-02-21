#include <iostream>
using namespace std;

long long GCD(long long a, long long b)
{
    if (a % b == 0)
    {
        return b;
    }
    return GCD(b, a % b);
}

int main()
{
    long long a, b;

    cin >> a >> b;

    for (int i = 1; i <= GCD(a, b); i++)
    {
        cout << 1;
    }
    cout << '\n';

    return 0;
}

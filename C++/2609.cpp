#include <iostream>
using namespace std;

int GCD( int a, int b)
{
    int r = a % b;
    if (r == 0)
        return b;
    return GCD(b, r);
}

int main()
{
    int n, m;
    cin >> n >> m;
    cout << GCD(n, m) << '\n' <<  n * m / GCD(n, m);

    return 0;
}

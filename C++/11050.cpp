#include <iostream>
using namespace std;

int ihang(int num)
{
    int result = 1;
    for (int i = num; i > 0; i--)
    {
        result *= i;
    }
    return result;
}

int main()
{
    int n, k;
    cin >> n >> k;

    int dab = ihang(n) / (ihang(k) * ihang(n - k));

    cout << dab;

    return 0;
}

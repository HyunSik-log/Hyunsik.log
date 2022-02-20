#include <iostream>
using namespace std;

int main()
{
    long long l;
    string input;
    long long m = 1234567891;
    long long r = 31;
    long long result = 0;

    cin >> l;
    cin >> input;

    for (long long i = 0; i < l; i++)
    {
        char abc = input[i];
        abc -= ('a' - 1);

        long long z = 1;

        for (long long j = 1; j <= i; j++)
        {
            z *= 31;

            if (z > m)
                z = z % m;
        }
        result += (long long)abc * z;

        if (result > m)
            result = result % m;
    }
    cout << result;

    return 0;
}

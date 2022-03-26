#include <iostream>
using namespace std;

int main()
{
    int N;
    int result;
    int num;

    cin >> N;

    for (int i = 0; i < N; i++)
    {
        num = i;
        result = num;

        while (num != 0)
        {
            result += num % 10;
            num /= 10;
        }

        if (result == N)
        {
            cout << i;
            return 0;
        }
    }
    
    cout << 0;

    return 0;
}


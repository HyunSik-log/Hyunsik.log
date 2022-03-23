#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

string board[50];
string white[8] =
{
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW"
};
string black[8] =
{
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB"
};

int White(int x, int y)
{
    int count= 0;

    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            if (board[x + i][y + j] != white[i][j])
            {
            count++;
            }
        }
    }
    return count;
}

int Black(int x, int y)
{
    int count= 0;

    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            if (board[x + i][y + j] != black[i][j])
            {
                count++;
            }
        }
    }
    return count;
}

int main()
{
    int n, m;
    int result = 64;

    cin >> n >> m;

    for (int i = 0; i < n; i++)
    {
        cin >> board[i];
    }

    for (int i = 0; i + 8 <= n; i++)
    {
        for (int j = 0; j + 8 <= m; j++)
        {
            result = min(result, min(White(i,j), Black(i,j)));
        }
    }
    cout << result << '\n';

    return 0;
}

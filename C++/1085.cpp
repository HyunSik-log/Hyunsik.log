#include <iostream>
using namespace std;

int main()
{
    int x, y, w, h;
    int garo1, garo2, sero1, sero2;
    int resultgaro, resultsero;

    cin >> x >> y >> w >> h;

    garo1 = x;
    garo2 = w - x;
    sero1 = y;
    sero2 = h - y;

    if (garo1 < garo2)
        resultgaro = garo1;
    else
        resultgaro = garo2;

    if (sero1 < sero2)
        resultsero = sero1;
    else
        resultsero = sero2;

    if (resultgaro < resultsero)
        cout << resultgaro;
    else
        cout << resultsero;

    return 0;
}

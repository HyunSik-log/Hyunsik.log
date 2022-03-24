#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    string pel;

    while (pel != "0")
    {
        cin >> pel;

        string str = pel;
        reverse (pel.begin(), pel.end());

        if (pel != "0")
        {
            if (pel == str)
                cout << "yes\n";
            
            else
                cout << "no\n";
        }
    }

    return 0;
}

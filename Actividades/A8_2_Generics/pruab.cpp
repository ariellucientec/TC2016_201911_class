#include<iostream>

using namespace std;

void fun(int a[5])
{
    a[0] = 10;
}
int main()
{
    int* b = new int[5];
    int a[5];
    a[0] = 5;
    a[1] = 11;
    cout<< &a << endl;    
    cout << (a+1);

    return 0;
}
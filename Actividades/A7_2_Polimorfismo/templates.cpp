#include<iostream>
using namespace std;

template<class T>
int aplicaFuncion(int val1, int val2, T funcion)
{    
    cout << funcion(val1, val2);
    return 1;
}




int suma(int a, int b)
{
    return a+b;
}

typedef 

int main()
{
    int(*fn)(int, int) = suma;
    aplicaFuncion(2,2, fn);
}
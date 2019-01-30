#include<iostream>
using namespace std;

class Fraction
{
private:
    int num;
    int den;
public:
    Fraction(int num, int den);
    Fraction multuply(Fraction);
    void print();
    int getNum();
    int getDen();
};

Fraction::Fraction(int num, int den)
{
    this->num = num;
    this->den = den;
}

int Fraction::getNum()
{
    return num;
}

int Fraction::getDen()
{
    return num;
}

Fraction Fraction::multuply(Fraction myF)
{    
    int numR = num*myF.getNum();
    int denR = den*myF.getDen();
    Fraction f = Fraction(numR,denR);    
    return f;
}

void Fraction::print()
{
    cout << num << "/" << den;
}

class Calculadora
{
public:
    template<class T>
    T sum(T num1, T num2);
};

template<class T>
T Calculadora::sum(T num1, T num2)
{
    return num1+num2;
}

int main()
{
    Fraction f = Fraction(30, 18);
    Fraction r = f.multuply(f);
    r.print();

    // Plantillas
    Calculadora c = Calculadora();
    cout << "\n" <<  c.sum(3.4, 8.2) << " " << c.sum(2,2) << " " << c.sum('h', 'o');
}
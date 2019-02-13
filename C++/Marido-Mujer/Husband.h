#include<iostream>
#include"Person.h"
#include<string>
using namespace std;

class Wife;
class Husband : public Person
{
private:
    Wife* w;
public:
    Husband(){}
    Husband(string name) : Person(name)
    {           
    }
    void getMarried(Wife* w);
};
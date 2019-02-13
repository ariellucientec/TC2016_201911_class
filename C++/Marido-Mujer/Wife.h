#include"Person.h"
#include<string>
#include<iostream>
using namespace std;

class Husband;  //forward-declaration
class Wife : public Person
{
private:
    Husband* h;
public:
    Wife(){}
    Wife(string name) : Person(name)
    {

    }
    void getMarried(Husband* h);
};

#include<string>
using namespace std;

#pragma once
class Person
{
private: 
    string name;
public:
    Person(){}
    Person(string name)
    {
        this->name = name;
    }
    string getName()
    {
        return name;
    }
};
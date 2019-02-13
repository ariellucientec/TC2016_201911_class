#include "Husband.h"
#include "Wife.h"
int main()
{
    Husband h = Husband("juan");
    Wife w = Wife("juanita");
    w.getMarried(&h);    

}
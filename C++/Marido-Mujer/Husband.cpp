#include "Husband.h"
#include "Wife.h"
void Husband::getMarried(Wife* w)
{
    this->w = w;
    cout << "soy" << getName() <<" y ya me casé  con" << w->getName();
}
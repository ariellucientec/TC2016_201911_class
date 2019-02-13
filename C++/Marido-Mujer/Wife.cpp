#include "Wife.h"
#include "Husband.h"
void Wife::getMarried(Husband* h)
{
    this->h = h;
     cout << "soy" << getName() <<" y ya me casé  con" << h->getName();
}
public interface PriceRelatable
{
    int getPrice();

    default boolean isMoreExpensive(PriceRelatable p)
    {
        if(this.getPrice() > p.getPrice())
            return true;        
        return false;
    }
}
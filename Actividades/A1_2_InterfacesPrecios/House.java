public class House implements PriceRelatable
{
    protected int numRooms;
    public House(int numRooms)
    {
        this.numRooms = numRooms;
    }

    public int getPrice()
    {
        return numRooms*100000;
    }
}
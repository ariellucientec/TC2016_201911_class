package Actividades.A10_2_IPTables;

public class Triplet<First, Second, Third>
{
    protected First first;
    protected Second second;
    protected Third third;

    public Triplet(First first, Second second, Third third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public First getFirst(){return first;}
    public Second getSecond(){return second;}
    public Third getThird(){return third;}

    public String toString()
    {
        return "("+first+", "+second+", "+third+")";
    }
}
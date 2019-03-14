public class InsufficientFundsException extends Exception
{
    protected double missing;
    public InsufficientFundsException(double missing)
    {
        this.missing = missing;
    }
    public String toString()
    {
        return new String("te faltan " + missing + " pesos");
    }
}
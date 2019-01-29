public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        if(denominator == 0)
        {
            System.out.println("error");
            denominator = 1;
        }
        this.denominator = denominator;
    }

    public int getNumerator()
    {
        return numerator;
    }
    public int getDenominator()
    {
        return denominator;
    }
    public Fraction multiply(Fraction f2)
    {
        int numRes = numerator * f2.getNumerator();
        int denRes = denominator * f2.getDenominator();

        Fraction result = new Fraction(numRes, denRes);
        return result;
    }
    public void print()
    {
        if(denominator == 1)
            System.out.println(numerator);
        else
            System.out.println(numerator + "/" + denominator);
    }

    public void simplify()
    {
        int cont = 2;
        while(cont <= denominator)
        {
            if(numerator % cont == 0 && denominator % cont == 0)
            {
                numerator /= cont;
                denominator /=cont;
                cont = 2;
            }
            else
                cont++;
        }
    }
}
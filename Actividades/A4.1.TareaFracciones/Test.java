public class Test
{
    public static void main(String[] args) 
    {
        Fraction f1 = new Fraction(450, 36);
        Fraction f2 = new Fraction(15, 2);

        Fraction f3 = f1.multiply(f2);
        f1.simplify();
        f1.print();

        Fraction copia = f1;
        copia.print();
    }

}
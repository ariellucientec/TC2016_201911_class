public class Car implements PriceRelatable
{
    protected String modelo;
    public Car(String modelo)
    {
        this.modelo = modelo;
    }

    public int getPrice()
    {
        if(modelo.equals("advanced"))
            return 100000;
        return 50000;
    }
}
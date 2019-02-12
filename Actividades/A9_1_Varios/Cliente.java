public class Cliente extends Person
{
    private Cliente(){}
    public Cliente(String nombre)
    {
        super(nombre);
    }
    public void retirar(double cantidad, Sucursal s)
    {
        s.retiro(cantidad, this);
    }

    public static void main(String[] args) {
        Sucursal sj = new Sucursal("San Juan");
        Sucursal sb = new Sucursal("San Benito");
        Cliente c = new Cliente("Pedrito");

        c.retirar(10000, sj);

        c.retirar(50000, sb);
    }
}
public class Concesionaria
{
    private String concesionaria;
    private Mecanico mecanico;

    public Concesionaria()
    {

    }

    public void contratarMecanico(Mecanico m)
    {
        mecanico = m;
    }

    public Concesionaria(String concesionaria)
    {
        this.concesionaria = concesionaria;
    }
    public void agendarServicio(Conductor c)
    {
        System.out.println("Concesionaria: dando servicio a: " + c.getNombre());
    }
    public String getConcesionaria()
    {
        return concesionaria;
    }
}

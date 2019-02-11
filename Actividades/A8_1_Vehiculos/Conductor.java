public class Conductor extends Persona
{
    public void agendarServicio(Concesionaria c)
    {
        System.out.println("soy :" + getNombre());
        System.out.println("conductor: quiero un servicio en " + c.getConcesionaria());
        c.agendarServicio(this);
    }

    public Conductor()
    {

    }
    public Conductor(String nombre)
    {
        super(nombre);
    }
}
public class Test
{
    public static void main(String[] args) 
    {
        Auto a = new Auto(4);
        
        Concesionaria c = new Concesionaria("San Juan");

        Conductor cond = new Conductor("ariel");

        cond.agendarServicio(c);

        Mecanico mec = new Mecanico("el Alfred");

        c.contratarMecanico(mec);
        
    }
}
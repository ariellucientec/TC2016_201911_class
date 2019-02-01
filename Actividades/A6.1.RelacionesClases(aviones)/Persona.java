public class Persona
{
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String direccion, String telefono)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void print()
    {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Dirección: "+ direccion);
        System.out.println("Teléfono: "+ telefono);
    }
}
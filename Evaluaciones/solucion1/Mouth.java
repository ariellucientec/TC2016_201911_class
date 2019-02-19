package solucion1;

public class Mouth 
{
    //parts
    private Lip[] lips;

    //constructors
    public Mouth()
    {
        lips = new Lip[2];
        lips[0] = new Lip();
        lips[1] = new Lip();
    }
    //getters
    
    //actions
    public void kiss(Person p)
    {
        System.out.println(" is kissing " + p.getName());
    }
    public void talk(String message)
    {
        System.out.println(message);
    }
    
}
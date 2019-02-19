package Evaluaciones.solucion1;

public class Person
{
    //parts
    private Head head;        
    private String name;
    private Person allowed2Kiss;    

    private Person(){}
    public Person(String name)
    {
        this.name = name;
        allowed2Kiss = null;

        // Build parts
        head = new Head();
    }    
    //getters
    public String getName()
    {
        return name;
    }
    public Head getHead()
    {
        return head;
    }

    public void ask4Permission2Kiss(Person p) //p is susanita (ver main)
    {
        getHead().getMouth().talk("can I kiss you, "+ p.getName() + "?");
        p.givePermission2Kiss(this); //this es pedro  (ver main)
    }
    private void givePermission2Kiss(Person p)
    {
        // If she/he is not too old or not too ugly
        allowed2Kiss = p; //p is Pedro
    }
    public void kiss(Person p)
    {
        Person allowed = p.getWhosAllowed2Kiss();
        if(allowed != null && getName() == allowed.getName())
        {
            System.out.print(getName());
            getHead().getMouth().kiss(p);
        }
        else
            System.out.println(p.getName() + " me bateó");
    }    
    private Person getWhosAllowed2Kiss()
    {
        return allowed2Kiss;
    }
}
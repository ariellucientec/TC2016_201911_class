import java.util.Date;

public class Visitor extends Person
{
    private Date dateVisit;
    public Visitor(String name)
    {
        super(name);
    }
    public void visit(Institution inst)
    {
        System.out.println(getName() + " is visiting " + inst.getInstName());
    }
}
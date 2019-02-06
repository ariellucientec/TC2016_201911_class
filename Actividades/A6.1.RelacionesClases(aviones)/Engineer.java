public class Engineer extends Person
{
    private String licensedRole;
    
    public Engineer(String name, String address, String phone,
                    String licensedRole)
    {
        this.licensedRole = licensedRole;
    }
    public void repair()
    {
        System.out.println("Engineer is repairing");
    }
    public void print()
    {
        super.print();
        System.out.println("Licensed Role: " + licensedRole);
    }
}
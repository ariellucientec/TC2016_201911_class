public class Husband extends Person
{
    private Wife w = null;

    private Husband(){}

    public Husband(String name)
    {
        super(name);
    }

    public void getMarried(Wife w)
    {
        if(w != this.w)
        {
            this.w = w;
            w.getMarried(this);
        }
    }

    public void giveLove()
    {
        System.out.println("soy "+ getName()+ " y amo a " + w.getName());
    }
    public static void main(String[] args) 
    {
        Husband h = new Husband("Juanito");  
        Wife w = new Wife("Juanita");
        w.getMarried(h);

        w.giveLove();
        h.giveLove();

    }
}
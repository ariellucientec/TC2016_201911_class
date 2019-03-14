package Actividades.A4_2_Singleton;

public class Singleton
{
    public int value;
    protected static Singleton instance = null;
    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
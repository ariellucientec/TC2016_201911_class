package Actividades.A9_2_DNS;

public class IPNotFoundException extends Exception
{
    String msg;
    public IPNotFoundException(String msg)
    {
        this.msg = msg;
    }
    public String toString()
    {
        return "Domain " + msg + " not found";
    }
}
package Actividades.A10_2_IPTables;

public class IPRejectedException extends Exception
{
    protected String ip;
    public IPRejectedException(String ip)
    {
        this.ip = ip;
    }
    public String toString()
    {
        return "La IP " + ip + " fue rechazada por el servidor";
    }
}
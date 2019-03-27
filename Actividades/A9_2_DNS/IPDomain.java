package Actividades.A9_2_DNS;

public class IPDomain<IP, Domain>
{
    protected IP ip;
    protected Domain domain;
    public IPDomain(IP ip, Domain domain)
    {
        this.ip = ip;
        this.domain = domain;
    }
    public IP getIP()
    {
        return ip;
    }
    public Domain getDomain()
    {
        return domain;
    }
    public String toString()
    {
        return "<"+ip+", "+domain+">";
    }
}
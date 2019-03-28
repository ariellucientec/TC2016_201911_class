package Actividades.A10_2_IPTables;

import Actividades.A9_2_DNS.*;

public class Server
{
    protected IPTables ipTables;
    protected DNS dns;

    public Server()
    {
        ipTables = new IPTables();
        dns = new DNS();
    }

    public void simulateNavigation(String ip, String URL)
    {
        try
        {
            if(ipTables.allowedIP(ip) && ipTables.isIPTablesRunning())
            {
                try
                {
                    IPDomain response = dns.search(URL);
                    System.out.println("ip "+ip+" is navigating at "+response.getDomain()+" whose ip is "+response.getIP());
                }catch(IPNotFoundException e)
                {
                    System.out.println(e.toString());
                }            
            }
            else
                System.out.println("el servidor no acepta ninguna conexión");
        }catch(IPRejectedException e)
        {
            System.out.println(e.toString());
        }
    }

    public IPTables getIPTables()
    {
        return ipTables;
    }
    
    public DNS getDNS()
    {
        return dns;
    }
}
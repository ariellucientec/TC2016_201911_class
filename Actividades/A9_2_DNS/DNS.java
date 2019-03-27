package Actividades.A9_2_DNS;

import Actividades.A9_2_DNS.IPNotFoundException;

public class DNS
{
    COMServer comServer;

    public DNS()
    {
        comServer = COMServer.getInstance();
    }

    public IPDomain search(String address) throws IPNotFoundException
    {
        String[] getDomainNameExtension = address.split("\\.");
        String extension = getDomainNameExtension[getDomainNameExtension.length-1];
        if(extension.equals("com"))
            return comServer.search(address);
        else 
            return null;
    }
}
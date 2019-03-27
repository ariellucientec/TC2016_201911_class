package Actividades.A9_2_DNS;

import Actividades.A9_2_DNS.IPDomain;

public class COMServer
{
    protected IPDomain[] predefinedList;
    protected int size = 10;
    private static COMServer instance = null;
    protected COMServer()
    {
        predefinedList = new IPDomain[size];
        for(int i = 0; i<size; i++)
        {
            predefinedList[i] = new IPDomain<String,String>("192.169.0."+i, "www.site"+i+".com");
        }
    }
    public static COMServer getInstance()
    {
        if(instance == null)
            return new COMServer();
        else   
            return instance;
    }
    public IPDomain search(String address) throws IPNotFoundException
    {
        for(int i=0; i<size;i++)
        {
            if(predefinedList[i].getDomain().equals(address))
                return predefinedList[i];
        }
        throw new IPNotFoundException(address);
    }
}
package Actividades.A9_2_DNS;

import java.util.Scanner;

import Actividades.A9_2_DNS.IPNotFoundException;

public class Test
{
    public static void main(String[] args) {
        DNS dns = new DNS();

        Scanner s = new Scanner(System.in);
        System.out.println("página buscada: ");
        String address = s.next();
        try
        {
            IPDomain response = dns.search(address);
            System.out.println(response.getIP());
        }catch(IPNotFoundException e)
        {
            System.out.println(e.toString());
        }
    }
    /*
        para probar introduce:
            www.site0.com
        
        **funciona con números del 0 al 9**
    */
}
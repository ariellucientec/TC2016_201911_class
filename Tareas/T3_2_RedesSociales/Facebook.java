package Tareas.T3_2_RedesSociales;

import Actividades.A3_2_Latencia.Latency;

public class Facebook extends SocialNetwork
{
    public Facebook()
    {
        socialNetworkName = "FACEBOOK";
    }    

    public void postMessage(String message, User u)
    {
        if(userLogged(u))
        {
            sendData(message.getBytes());                
            int maxCharPerRow = 50;
            int size = (6+message.length()/maxCharPerRow+1);  
            for(int i=0;i<31;i++)System.out.print("*");      
            System.out.print("FACEBOOK");
            for(int i=0;i<31;i++)System.out.print("*");
            System.out.println();
            for(int j = 0; j < size; j++)    
            {                    
                if(j == 0 || j==size-1)            
                    for(int k=0;k<maxCharPerRow+20;k++) System.out.print("*");
                else
                {
                    for(int k=0;k<10;k++) System.out.print(" ");                             
                    if(j == size-6)
                    {
                        System.out.print(message.substring((j-1)*(maxCharPerRow),message.length()));    
                        j = size-2;
                    }                    
                    else
                        System.out.print(message.substring((j-1)*(maxCharPerRow),j*(maxCharPerRow)));
                    for(int k=0;k<maxCharPerRow-10;k++) System.out.print(" ");
                }                
                System.out.println();
            }
        }
        else
            System.out.println("user: " + u.getUserName() + " not logged in to post");        
    }
    protected void sendData(byte[] messageBytes)
    {
        Latency.simulateLatency(2, 5);
    }    
}
package Tareas.T3_2_RedesSociales;

import java.util.Date;
import java.util.Random;
import java.util.Calendar;

public class Tiempo
{
    public static void main(String[] args) {        
        Random r = new Random();
        int randVal = r.nextInt(15)+2;                
        long l = System.currentTimeMillis();                
        while(true)
        {            
            long temp = System.currentTimeMillis();            
            System.out.println("temp: " + temp + " l "+l);
            if(l+randVal*1000 < temp)
                break;            
        }
    try{
        Thread.sleep(3000);
    }catch(InterrumptedException e)
    {
        
    }    
}
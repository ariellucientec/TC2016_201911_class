package Actividades.A4_2_Singleton;

import Actividades.A3_2_Latencia.Latency;

public class Test
{
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.value =10;
        System.out.println(s.value);
        Singleton second = Singleton.getInstance();
        second.value = 12;
        System.out.println(s.value);
        Latency.simulateLatency(2,10);

    }
}
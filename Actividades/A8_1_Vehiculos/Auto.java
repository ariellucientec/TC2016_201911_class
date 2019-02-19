public class Auto
{   
    private String color;

    private int numPuertas;
    private Puerta[] listaPuertas;

    private int numVentanas;
    private Puerta[] listaVentanas;

    private Auto()
    {

    }
    
    public Auto(int numPuertas, int numVentanas, String color)
    {        
        this.numPuertas = numPuertas;
        listaPuertas = new Puerta[numPuertas];
        for (int i = 0; i < numPuertas; i++) 
        {
            Puerta p = new Puerta();
            listaPuertas[i] = p;    
        }

        this.numVentanas = numVentanas;
        
        /*listaVentanas = new Ventana[numVentanas];
        for (int i = 0; i < numVentanas; i++) 
        {
            Ventana p = new Ventana();
            listaVentanas[i] = p;    
        }*/
        System.out.println("se creó el auto");

        this.color = color;
    }

    public int getNumPuertas()
    {
        return numPuertas;
    }    
}
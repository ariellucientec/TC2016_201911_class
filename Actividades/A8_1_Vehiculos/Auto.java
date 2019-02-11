public class Auto
{
    private int numPuertas;
    private Puerta[] listaPuertas;

    public Auto(int numPuertas)
    {
        this.numPuertas = numPuertas;
        listaPuertas = new Puerta[numPuertas];
        for (int i = 0; i < numPuertas; i++) 
        {
            Puerta p = new Puerta();
            listaPuertas[i] = p;    
        }
        System.out.println("se creó el auto");
    }
}
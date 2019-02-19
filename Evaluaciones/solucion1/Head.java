package Evaluaciones.solucion1;

public class Head
{
    //parts
    private Mouth mouth;

    //constructors
    public Head()
    {
        //build parts
        mouth = new Mouth();
    }   
    
    //getters
    public Mouth getMouth()
    {
        return mouth;
    }
}
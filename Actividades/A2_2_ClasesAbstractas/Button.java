package Actividades.A2_2_ClasesAbstractas;

public class Button extends GraphicComponent implements Clickeable
{
    public void click(int x, int y)
    {
        System.out.println("dando click en " + x + " " + y);
    }
    public void setLocation(Point position)
    {
        this.position = position;
    }
    public void setBackgroundColor(Color c)
    {
        background = c;
    }
    public void drawComponent()
    {
        System.out.println("estoy dibujando un botón en la posición " + position.x + " " + position.y);
    }
}
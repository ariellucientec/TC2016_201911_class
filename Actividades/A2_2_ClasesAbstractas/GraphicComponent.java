package Actividades.A2_2_ClasesAbstractas;

public abstract class GraphicComponent
{
    protected Color background;
    protected Point position;

    public abstract void drawComponent();
    public abstract void setLocation(Point position);
    public abstract void setBackgroundColor(Color color);
}
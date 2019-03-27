//clase genérica
public class Tuple <Key, Value>  //Key y Value son Tipos de Datos Genéricos
{
    protected Key key;
    protected Value value;
    protected String name;

    public Tuple(Key key, Value value)
    {
        this.key = key;
        this.value = value;
        name = "tupla";
    }
    public Key getKey()
    {
        return key;
    }
    public Value getValue()
    {
        return value;
    }
    
    public String toString()
    {
        return "(" + key + ", " + value + ")";
    }

}
public class Helicopter
{
    private int numberOfFanBlades;
    private FanBlades[]theFanBlades;
    public Helicopter(int numberOfFanBlades)
    {
        theFanBlades = new FanBlades[numberOfFanBlades];
        for (int i = 0; i < numberOfFanBlades; i++) {
            theFanBlades[i] = new FanBlades();
        }
    }
}
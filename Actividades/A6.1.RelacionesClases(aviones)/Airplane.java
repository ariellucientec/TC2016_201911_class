public class Airplane extends MotorAirCraft
{
    private int numberOfWings;
    private AircraftWings[]theWings;
    public MotorAircraft(int numberOfWings)
    {
        theWings = new AircraftWings[2];
        for(i=0;i<numberOfWings; i++)
            theWings[i] = new AircraftWings(); 
    }
}


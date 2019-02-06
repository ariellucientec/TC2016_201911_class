public class MotorAircraft
{
    private String airLineName;
    private Motor theEngine;
    private Pilot thePilot;
    public MotorAircraft(String airLineName, Pilot thePilot)
    {
        this.airLineName = airLineName;
        theEngine = new Motor();
        this.thePilot = thePilot;
    }
    public void fly()
    {
        thePilot.print();
        System.out.println(" is flying the plane");
    }
    public void maintainance(Engineer engineer)
    {
        engineer.repair();
    }
    public void print()
    {
        System.out.println("Plane from: " + airLineName + " airline");
    }
}
public class Test
{
    public static void main(String[] args) 
    {
        Pilot jorge = new Pilot("Jorge", "carlos lazo 100", "5544332211", 100, 200);

        MotorAircraft boeing = new MotorAircraft("AeroMéxico", jorge);

        Passenger juan = new Passenger("juan", "carlos lazo", "12213", 1111, "Primera Clase");

        juan.flyTo("United States", boeing);
    }
}
public class Passenger extends Person
{
    private int ticketNumber;
    private String ticketType;
    public Passenger(String name, String address, String phone, 
                     int ticketNumber, String ticketType)
    {
        super(name, address, phone);
        this.ticketNumber = ticketNumber;
        this.ticketType = ticketType;
    }
    public void print()
    {
        super.print();
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Ticket Type: " + ticketType);
    }
    public void flyTo(String destination, MotorAircraft plane)
    {
        plane.print();
        System.out.println("is flying to: " + destination);
    }
}
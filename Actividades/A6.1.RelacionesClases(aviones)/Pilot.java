public class Pilot extends Person
{
    private int flightTime;
    private int licenseNumber;
    public Pilot(String name, String address, String phone, 
                 int flightTime, int licenseNumber)
    {
        super(name, address, phone);
        this.flightTime = flightTime;
        this.licenseNumber = licenseNumber;
    }

    public void print()
    {
        super.print();
        System.out.println("Flight Time: " + flightTime);
        System.out.println("License Number: " + licenseNumber);
    }
}
public class Prueba
{
    public static void main(String[]args)
    {
        Date myDate = new Date();
        myDate.setDay(24);
        myDate.setMonth(11);
        myDate.setYear(2020);
        System.out.println(myDate.getDateString());

        Date otherDate = new Date();
        otherDate.setDate("14/01/2019");
        System.out.println(otherDate.getDateString());
    }
}
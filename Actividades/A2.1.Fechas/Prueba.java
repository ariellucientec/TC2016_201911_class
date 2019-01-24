public class Prueba
{
    public static void main(String[]args)
    {
        Date myDate = new Date();
        myDate.setDay(14);
        myDate.setMonth(1);
        my

        Date otherDate = new Date();
        otherDate.setDate("14/01/2019");

        System.out.println(otherDate.getDateString());
    }
}
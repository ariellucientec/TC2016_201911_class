import com.sun.javafx.util.TempState;

public class Date
{
    private int day, month, year;

    public void setDay(int day)
    {
        this.day = day;
    }
    public int getDay()
    {
        return day;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    public int getMonth()
    {
        return month;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public int getYear()
    {
        return year;
    }
    public void setDate(String date)
    {
        if(date.length() != 10)
        {
            System.out.println("formato incorrecto");
            return;
        }
        String[] stringDate = date.split("/");
        day = Integer.parseInt(stringDate[0]);
        month = Integer.parseInt(stringDate[1]);
        year = Integer.parseInt(stringDate[2]);
    }
    public String getDateString()
    {
        String tempDate = new String("");
        tempDate = tempDate + day + "/" + month + "/" + year;
        return tempDate;
    }
}
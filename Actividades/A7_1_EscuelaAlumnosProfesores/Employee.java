import java.util.Calendar;
import java.util.Date;

public class Employee extends Person
{
    private Job hisJob;
    
    //aquí hay composición con Job
    public Employee(String name, int jobId, int salary)
    {
        super(name);
        hisJob = new Job(jobId, salary, new Date());
    }

    public void print()
    {

    }
}
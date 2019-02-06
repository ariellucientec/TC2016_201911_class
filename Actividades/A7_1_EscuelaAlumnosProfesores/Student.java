public class Student extends Person
{
    int studentID;
    public Student(String name, int studentID)
    {
        super(name);
        this.studentID = studentID;
    }
    public void print()
    {
        System.out.println("estudiante: "+getName()+" Student ID: "+studentID);
    }
}
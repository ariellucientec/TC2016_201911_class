public class Persona
{
    //attributes
    private int age;
    private String name;
    private char gender;

    //methods
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGender(char gender)
    {
        this.gender = gender;
    }
    public char getGender()
    {
        return gender;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
}
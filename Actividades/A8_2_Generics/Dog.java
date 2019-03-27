public class Dog implements Comparable<Dog>
{
    protected int age;
    public Dog(int age)
    {
        this.age = age;    
    }
    public int getAge()
    {
        return age;
    }
    public int compare2(Dog object1)
    {
        //-1 si es menor
        // 0 sin son iguales
        // 1 si es mayor
        if (getAge() > object1.getAge())
            return 1;
        else if(getAge() < object1.getAge())
            return -1;
        else 
            return 0;
    }
}
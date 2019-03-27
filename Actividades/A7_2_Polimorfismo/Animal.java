public abstract class  Animal
{
    public abstract void eat();
    public abstract void wakeUp();
    public abstract void run();
    public abstract void sleep();


    public void doHisStuff()
    {
        wakeUp();
        eat();
        run();
        sleep();
    }
}


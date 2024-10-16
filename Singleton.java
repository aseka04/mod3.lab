package labka;

public class Singleton
{
    public void DoSomething()
    {
        System.out.println("Doing something...");
    }
}

class Client {
    private Singleton singleton = new Singleton();
    public void Execute()
    {
        singleton.DoSomething();
    }
}


package labka;

public class Start_stop {
    public void Start()
    {
        System.out.println("Started");
    }
    public void Stop()
    {
        System.out.println("Stopped");
    }

}
class Car extends Start_stop{
    @Override
    public void Start() {
        super.Start();
    }

    @Override
    public void Stop() {
        super.Stop();
    }
}
class Truck extends Start_stop{
    @Override
    public void Start() {
        super.Start();
    }

    @Override
    public void Stop() {
        super.Stop();
    }
}
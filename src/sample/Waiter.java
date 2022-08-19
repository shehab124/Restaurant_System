package sample;

public class Waiter extends Person
{


    public Waiter() {
    }

    public Waiter(String name, String address, double salary,String password)
    {
        super(name, address, salary,password);
    }
    public String getPosition()
    {
        return "Waiter";
    }
}

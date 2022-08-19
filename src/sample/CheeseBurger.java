package sample;

public class CheeseBurger extends Dishes
{
    public CheeseBurger()
    {
        name = "Cheese Burger Sandwich";
        components = "Cheese Burger Sandwich";
    }
    @Override
    public double cost()
    {
        return 90.0;
    }
}
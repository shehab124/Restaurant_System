package sample;

public class Cheese extends ToppingsDecorator
{
    Dishes dish;

    public Cheese(Dishes dish) // Constructor
    {
        this.dish = dish;
    }
    @Override
    public String getComponents()
    {
        return dish.getComponents() + ", Cheese";
    }
    @Override
    public double cost()
    {
        return 10 + dish.cost();
    }
}



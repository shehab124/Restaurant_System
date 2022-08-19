package sample;

public class Ranch extends ToppingsDecorator
{
    Dishes dish;

    public Ranch(Dishes dish)
    {
        this.dish = dish;
    }

    @Override
    public String getComponents()
    {
        return dish.getComponents() + ", Ranch sauce";
    }

    @Override
    public double cost()
    {
        return 12 + dish.cost();
    }
}


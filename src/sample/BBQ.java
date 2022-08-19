package sample;

public class BBQ extends ToppingsDecorator{
    Dishes dish;

    public BBQ(Dishes dish)
    {
        this.dish = dish;
    }

    @Override
    public String getComponents()
    {
        return dish.getComponents() + ", BBQ sauce";
    }
    @Override
    public double cost()
    {
        return 15 + dish.cost();
    }

}



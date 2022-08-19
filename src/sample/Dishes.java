package sample;

public abstract class Dishes
{
    public String name;
    public String components;

    public String getName() //returns name of dish
    {
        return name;
    }
    public String getComponents() //returns components of dish + toppings
    {
        return components;
    }
    public abstract double cost(); //returns total cost of dish + toppings cost
}



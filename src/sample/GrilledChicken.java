package sample;

public class GrilledChicken extends Dishes
{
    public GrilledChicken()
    {
        name = "Grilled Chicken Sandwich";
        components = "Grilled Chicken Sandwich";
    }

    @Override
    public double cost() {
        return 100.0;
    }
}

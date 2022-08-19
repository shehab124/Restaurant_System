package sample;

public class FriedChicken extends Dishes
{
     public FriedChicken()
     {
         name = "Fried Chicken Sandwich";
         components = "Fried Chicken Sandwich";
     }

    @Override
    public double cost() {
        return 110;
    }
}




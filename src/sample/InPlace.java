package sample;

public class InPlace implements Itakeorder
{
    public double price;
    public final double taxes = 0.14;
    public double totalPrice;
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public double getTotalPrice() {
        return totalPrice;
    }
}

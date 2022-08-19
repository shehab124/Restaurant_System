package sample;

public class Deilvery implements Itakeorder{
    String name;
    String telephone;
    String address;
    double price;
    double totalPrice;
    public final double taxes=0.14;

    public Deilvery(String name, String telephone, String addresse) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }
    @Override
    public double getPrice() {
        return price;
    }
}

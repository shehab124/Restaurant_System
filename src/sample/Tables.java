package sample;

import java.util.ArrayList;

public class Tables {
    private int capacity; //capacity of table
    private boolean reserved; //check if table is reserved, Reserved -> 1   Not Reserved -> 0
    private boolean smoking;  // smoking -> 1 non-smoking -> 0

    private ArrayList<Dishes> dishes = new ArrayList<Dishes>();

    //constructors
    public Tables() { }

    public Tables(int capacity, boolean smoking)
    {
        this.capacity = capacity;
        this.smoking = smoking;
    }
    /////////////////////

    //Getters and Setters
    public boolean isReserved()
    {
        return reserved;
    }  //to check if table is reserved

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    } //to reserve or delete reservation of table

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public ArrayList<Dishes> getDishes() { return dishes; }

    public void setDishes(ArrayList<Dishes> dishes) { this.dishes = dishes; }

    ////////////////////////////////////////////////////////////
}

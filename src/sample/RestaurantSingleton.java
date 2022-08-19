package sample;

import javafx.scene.control.Tab;

import java.util.ArrayList;

public class RestaurantSingleton {
    static private RestaurantSingleton restaurant = new RestaurantSingleton(); //Only instance of Restaurant

    public ArrayList<Reservation> reservationsList = new ArrayList<Reservation>(); //Single static list of all reservations
    public ArrayList<Tables> tablesList = new ArrayList<Tables>(); //tables list of all tables
    public ArrayList<Person> personList = new ArrayList<Person>();

    /*
   method to return the only instance of this class
   this instance is treated as a global instance
    */
    public static RestaurantSingleton getRestaurantSingleton()
    {
        return restaurant;
    }


    private RestaurantSingleton()  // private constructor so we can't instantiate another object outside this class
    {
        /*
        Creating 10 tables
        4 tables capacity=4 smoking=false
        1 table capacity=8 smoking=false
        4 tables capacity=4 smoking=true
        1 table capacity=8 smoking=true
         */
        for (int i=0;i<10;i++)
        {
            int capacity=4;
            boolean sm=false;
            if(i==4 || i ==9)
            {
                capacity = 8;
            }
            if(i>4)
            {
                sm = true;
            }
            tablesList.add(new Tables(capacity,sm));
        }

    }



}

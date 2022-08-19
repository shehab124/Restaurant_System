package sample;

public class Reservation {
    private String nameCustomer; // customer name
    private int seats; //number of seats
    private boolean smoking;
    private String date; // date of reservation


    public Reservation() {
    }

    public Reservation(String name, int seats, boolean smoking, String date) {
        this.nameCustomer = name;
        this.seats = seats;
        this.smoking = smoking;
        this.date = date;
    }

    public String getName() {
        return nameCustomer;
    }

    public void setName(String name) {
        this.nameCustomer = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    @Override
    public String toString() {
        return "Reservation{" +
                "Name Of Customer='" + nameCustomer + '\'' +
                ", Seats=" + seats +
                ", Smoking=" + smoking +
                ", Date='" + date + '\'' +
                '}';
    }
}

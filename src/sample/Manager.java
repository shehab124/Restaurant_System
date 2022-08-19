package sample;

public class Manager extends Person
{
    //private String password;

    public Manager() {  //default constructor
    }

    public Manager(String name, String address, double salary, String password) { //constructor
        super(name, address, salary,password);
        //this.password = password;
    }

    //public String getPassword() {
      //  return password;
    //}

    //public void setPassword(String password) {
      //  this.password = password;
    //}

    public String getPosition()
    {
        return "Manager";
    }
}

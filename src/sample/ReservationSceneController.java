package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ReservationSceneController //reservation by phone controller
{
    @FXML
    private TextField nameOfCustomer;

    @FXML
    private TextField numberOfSeats;

    @FXML
    private CheckBox smoking;

    @FXML
    private DatePicker date;

    @FXML
    private TextField name;

    @FXML
    private TextField pass;

    @FXML
    private TextField email;

    @FXML
    private TextField address;

    @FXML
    private TextField mobile;

    // Back button
    // Returns to waiter view from reservation view
    @FXML
    void changeSceneToWaiterVIew(ActionEvent event) throws IOException  //back button
    {
        Parent waiterView = FXMLLoader.load(getClass().getResource("waiterScene.fxml"));
        Scene waiterScene = new Scene(waiterView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(waiterScene);
        window.show();
    }




    /*
       THIS BUTTON CREATES A NEW RESERVATION
     */
    @FXML
    void reserveBttn(ActionEvent event)
    {
        //get data from data fields
        String name;
        int number;
        boolean smoke;
        String d;
        try
        {
            name = nameOfCustomer.getText();
            number = Integer.parseInt(numberOfSeats.getText());
            if(smoking.isSelected())
            {
                smoke = true;
            }
            else
            {
                smoke = false;
            }
            d = date.getValue().toString();
            Reservation res = new Reservation(name,number,smoke,d);
            RestaurantSingleton.getRestaurantSingleton().reservationsList.add(res);  //INSERT THE NEW RESERVATION IN RESERVATION LIST

            // ALERT BOX
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Reservation");
            alert.setHeaderText("A new reservation has been created!");
            int index = RestaurantSingleton.getRestaurantSingleton().reservationsList.lastIndexOf(res);
            alert.setContentText(RestaurantSingleton.getRestaurantSingleton().reservationsList.get(index).toString());
            alert.showAndWait();

            // All data fields are empty after ok button in alert box
            nameOfCustomer.setText("");
            numberOfSeats.setText("");
            smoking.setSelected(false);
            date.setValue(null);
        }
        catch (Exception exception)
        {
            //ALERT BOX TO SHOW THE ERROR
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error 404!");
            alert.setHeaderText("AN ERROR HAS OCCURED!");
            alert.setContentText("PLEASE FILL ALL DATA FIELDS IN THE RIGHT FORMAT!");
            alert.showAndWait();
        }
    }
}



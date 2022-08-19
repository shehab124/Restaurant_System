package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;

public class WaiterSceneController
{

    //Back button
    //This method returns to main scene
    @FXML
    void changeSceneToMainView(ActionEvent event) throws IOException
    {
        Parent mainView = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        Scene mainScene = new Scene(mainView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }

    //Reservation Button
    //This Method goes to Reservation view
    @FXML
    void changeSceneToReservationView(ActionEvent event) throws IOException
    {
        Parent reservationView = FXMLLoader.load(getClass().getResource("ReservationScene.fxml"));
        Scene reservationScene = new Scene(reservationView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(reservationScene);
        window.show();
    }

    @FXML
    void changeSceneToTakeOrderView(ActionEvent event) throws IOException
    {
        Parent takeOrderView = FXMLLoader.load(getClass().getResource("TakeOrderScene.fxml"));
        Scene takeOrderScene = new Scene(takeOrderView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(takeOrderScene);
        window.show();
    }

}

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerSceneController {


    @FXML
    void backToMainScene(ActionEvent event) throws IOException
    {
        Parent waiterView = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        Scene waiterScene = new Scene(waiterView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(waiterScene);
        window.show();
    }
    @FXML
    void bonusScene(ActionEvent event) throws IOException
    {
        Parent waiterView = FXMLLoader.load(getClass().getResource("BonusScene.fxml"));
        Scene waiterScene = new Scene(waiterView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(waiterScene);
        window.show();
    }
    @FXML
    void addEmp(ActionEvent event) throws IOException
    {
        Parent waiterView = FXMLLoader.load(getClass().getResource("AddEmployee.fxml"));
        Scene waiterScene = new Scene(waiterView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(waiterScene);
        window.show();
    }

    @FXML
    void reservationreports(ActionEvent event) throws IOException {
        Parent waiterView = FXMLLoader.load(getClass().getResource("ReservationReportScene.fxml"));
        Scene waiterScene = new Scene(waiterView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(waiterScene);
        window.show();
    }

}

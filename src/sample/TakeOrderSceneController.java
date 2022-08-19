package sample;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TakeOrderSceneController {

    @FXML
    void changeSceneToInPlaceView(ActionEvent event) throws IOException
    {
        Parent inPlaceView = FXMLLoader.load(getClass().getResource("InPlaceScene.fxml"));
        Scene inPlaceScene = new Scene(inPlaceView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(inPlaceScene);
        window.show();
    }

    @FXML
    void waiterScene(ActionEvent event) throws IOException
    {
        Parent inPlaceView = FXMLLoader.load(getClass().getResource("waiterScene.fxml"));
        Scene inPlaceScene = new Scene(inPlaceView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(inPlaceScene);
        window.show();
    }

    @FXML
    void deliveryScene(ActionEvent event) throws IOException
    {
        Parent inPlaceView = FXMLLoader.load(getClass().getResource("deliveryScene.fxml"));
        Scene inPlaceScene = new Scene(inPlaceView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(inPlaceScene);
        window.show();
    }

}
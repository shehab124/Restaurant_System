package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*

DELETED!!!
*/

public class Controller {

    /*
    *   when this method is called, it will change the scene to
    *   waiterScene
    */
    @FXML
    void changeSceneToWaiterVIew(ActionEvent event) throws IOException
    {
        Parent waiterView = FXMLLoader.load(getClass().getResource("waiterScene.fxml"));
        Scene waiterScene = new Scene(waiterView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(waiterScene);
        window.show();
    }
    @FXML
    void changeSceneToManagerView(ActionEvent event) throws IOException
    {
        Parent waiterView = FXMLLoader.load(getClass().getResource("ManagerScene.fxml"));
        Scene waiterScene = new Scene(waiterView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(waiterScene);
        window.show();
    }

}

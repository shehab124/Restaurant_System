package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddEmplyeeController {

    @FXML
    private TextField name;

    @FXML
    private TextField address;

    @FXML
    private TextField salary;

    @FXML
    private TextField password;

    @FXML
    void Add(ActionEvent event)
    {
        String n = name.getText();
        String add = address.getText();
        String s = salary.getText();
        String p =password.getText();

        double sal = Double.parseDouble(s);

        RestaurantSingleton.getRestaurantSingleton().personList.add(new Waiter(n,add,sal,p));

    }

    @FXML
    void backtomanager(ActionEvent event) throws IOException {
        Parent waiterView = FXMLLoader.load(getClass().getResource("ManagerScene.fxml"));
        Scene waiterScene = new Scene(waiterView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(waiterScene);
        window.show();

    }

}

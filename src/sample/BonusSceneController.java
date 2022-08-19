package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BonusSceneController {

    @FXML
    private TextField salary;

   // @FXML
    //private ComboBox comb;

    @FXML
    private TextField extraHours;

    @FXML
    private Label total;

    @FXML
    private TextField bonusPerHour;

   // @FXML
    //void comboBox(ActionEvent event) {

   //     String s = comb.getSelectionModel().getSelectedItem().toString();



  //  }


    @FXML
    void calculate(ActionEvent event) {
        double salaryy = Double.parseDouble(salary.getText());
        double extra = Double.parseDouble(extraHours.getText());
        double bonus = Double.parseDouble(bonusPerHour.getText());

        double totall= salaryy+(bonus*extra);
        String h=Double. toString(totall);

        total.setText(h);





    }
    ArrayList<String> names = new ArrayList<String>();
    //@Override
   /* public void initialize(URL url, ResourceBundle rb) {


        //comb.getItems().addAll();
        for(int i=0;i<RestaurantSingleton.getRestaurantSingleton().personList.size();i++)
        {
            if(RestaurantSingleton.getRestaurantSingleton().personList.get(i) instanceof Waiter)
            {
                names.add(RestaurantSingleton.getRestaurantSingleton().personList.get(i).getName());
            }
        }
        ObservableList<String> list= FXCollections.observableList(names);
        //comb.setItems(list);
        //comb.getItems().add();
        }*/


    @FXML
    void managerScene(ActionEvent event) throws IOException
    {
        Parent takeOrderView = FXMLLoader.load(getClass().getResource("ManagerScene.fxml"));
        Scene takeOrderScene = new Scene(takeOrderView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(takeOrderScene);
        window.show();
    }
    }




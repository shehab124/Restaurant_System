package sample;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

import java.io.IOException;

public class LogInController implements Initializable
{

    @FXML
    private TextField password;

    @FXML
    private TextField userName;

    @FXML
    private Circle c1;

    @FXML
    private Circle c2;




    @FXML
    void log(ActionEvent event) throws IOException {

        String user = userName.getText();
        String pass = password.getText();
        RestaurantSingleton.getRestaurantSingleton().personList.add(new Manager("chehab", "3emarat", 1500, "241"));
        RestaurantSingleton.getRestaurantSingleton().personList.add(new Manager("halawa", "smouha", 2500, "2511"));
        RestaurantSingleton.getRestaurantSingleton().personList.add(new Waiter("heba", "smouha", 3500, "255"));


        for (int i = 0; i < RestaurantSingleton.getRestaurantSingleton().personList.size(); i++)
        {
            if (Objects.equals(RestaurantSingleton.getRestaurantSingleton().personList.get(i).getName(), user) && Objects.equals(RestaurantSingleton.getRestaurantSingleton().personList.get(i).getPassword(), pass)) {
                if (RestaurantSingleton.getRestaurantSingleton().personList.get(i) instanceof Manager)
                {
                    Parent waiterView = FXMLLoader.load(getClass().getResource("ManagerScene.fxml"));
                    Scene waiterScene = new Scene(waiterView);
                    //this line gets the stage information
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(waiterScene);
                    window.show();
                } else if (RestaurantSingleton.getRestaurantSingleton().personList.get(i) instanceof Waiter) {
                    Parent waiterView = FXMLLoader.load(getClass().getResource("WaiterScene.fxml"));
                    Scene waiterScene = new Scene(waiterView);
                    //this line gets the stage information
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(waiterScene);
                    window.show();
                }


            }

        }


    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        setRotate(c1,true,360,10);
        setRotate(c2,false,360,10);
    }

    @FXML
    void about(ActionEvent event) {

        Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://www.mcdonalds.eg/learn/about-mcdonalds-egypt"));
        }
        catch(IOException err){

        }
        catch(URISyntaxException err)  {
            err.printStackTrace();
        }


    }

    private void setRotate(Circle c, boolean reverse, int angle,int duration)
    {
        RotateTransition rt = new RotateTransition(Duration.seconds(duration),c);
        rt.setAutoReverse(reverse);
        rt.setByAngle(angle);
        rt.setDelay(Duration.seconds(0));
        rt.setRate(15);
        rt.setCycleCount(100);
        rt.play();

    }
}


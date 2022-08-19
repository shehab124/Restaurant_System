package sample;

import java.io.IOException;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class InPlaceSceneController implements Initializable {

    @FXML
    private Label fried;

    @FXML
    private Label burger;

    @FXML
    private Label grilled;

    @FXML
    private Label cheeseFried;

    @FXML
    private Label BBQFried;

    @FXML
    private Label ranchFried;

    @FXML
    private Label cheeseBurger;

    @FXML
    private Label BBQBurger;

    @FXML
    private Label RanchBurger;

    @FXML
    private Label cheeseGrilled;

    @FXML
    private Label BBQGrilled;

    @FXML
    private Label ranchGrilled;

    @FXML
    private ComboBox<String> c; //tables

    @FXML
    private Button ToTakeOrder;

    @FXML
    private Label cost;



    //////////////////////////////////////////////////////////////


    @FXML
    void minusBBQBurger(ActionEvent event) {
        String x = BBQBurger.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        BBQBurger.setText(y);

    }

    @FXML
    void minusBBQFried(ActionEvent event) {
        String x = BBQFried.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        BBQFried.setText(y);
    }

    @FXML
    void minusBBQGrilled(ActionEvent event) {
        String x = BBQGrilled.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        BBQGrilled.setText(y);
    }

    @FXML
    void minusBurgerSand(ActionEvent event) {
        String x = burger.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        burger.setText(y);
    }

    @FXML
    void minusCheeseFried(ActionEvent event) {
        String x = cheeseFried.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        cheeseFried.setText(y);
    }

    @FXML
    void minusCheeseGrilled(ActionEvent event) {
        String x = cheeseGrilled.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        cheeseGrilled.setText(y);
    }

    @FXML
    void minusCheeseSauceBurger(ActionEvent event) {
        String x = cheeseBurger.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        cheeseBurger.setText(y);
    }

    @FXML
    void minusFried(ActionEvent event) {
        String x = fried.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        fried.setText(y);
    }

    @FXML
    void minusGrilled(ActionEvent event) {
        String x = grilled.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        grilled.setText(y);
    }

    @FXML
    void minusRanchBurger(ActionEvent event) {
        String x = RanchBurger.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        RanchBurger.setText(y);
    }

    @FXML
    void minusRanchFried(ActionEvent event) {
        String x = ranchFried.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        ranchFried.setText(y);
    }

    @FXML
    void minusRanchGrilled(ActionEvent event) {
        String x = ranchGrilled.getText();
        int i = Integer.parseInt(x);
        if (i > 0)
            i--;
        String y = Integer.toString(i);
        ranchGrilled.setText(y);
    }

    @FXML
    void plusBBQBurger(ActionEvent event) {
        String x = BBQBurger.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        BBQBurger.setText(y);
    }

    @FXML
    void plusBBQFired(ActionEvent event) {
        String x = BBQFried.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        BBQFried.setText(y);
    }

    @FXML
    void plusBBQGrilled(ActionEvent event) {
        String x = BBQGrilled.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        BBQGrilled.setText(y);
    }

    @FXML
    void plusBurgerSand(ActionEvent event) {
        String x = burger.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        burger.setText(y);

    }

    @FXML
    void plusCheeseFried(ActionEvent event) {
        String x = cheeseFried.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        cheeseFried.setText(y);
    }

    @FXML
    void plusCheeseGrilled(ActionEvent event) {
        String x = cheeseGrilled.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        cheeseGrilled.setText(y);
    }

    @FXML
    void plusCheeseSauceBurger(ActionEvent event) {
        String x = cheeseBurger.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        cheeseBurger.setText(y);
    }

    @FXML
    void plusFried(ActionEvent event) {
        String x = fried.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        fried.setText(y);

    }

    @FXML
    void plusGrilled(ActionEvent event) {
        String x = grilled.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        grilled.setText(y);

    }

    @FXML
    void plusRanchBurger(ActionEvent event) {
        String x = RanchBurger.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        RanchBurger.setText(y);

    }

    @FXML
    void plusRanchFried(ActionEvent event) {
        String x = ranchFried.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        ranchFried.setText(y);

    }

    @FXML
    void plusRanchGrilled(ActionEvent event) {
        String x = ranchGrilled.getText();
        int i = Integer.parseInt(x);
        i++;
        String y = Integer.toString(i);
        ranchGrilled.setText(y);
    }

    @FXML
    void receipt(ActionEvent event) throws Exception {
        int frieds = Integer.parseInt(fried.getText());
        int cheeseFrieds = Integer.parseInt(cheeseFried.getText());
        int bbqfrieds = Integer.parseInt(BBQFried.getText());
        int ranchfrieds = Integer.parseInt(ranchFried.getText());

        int burgers = Integer.parseInt(burger.getText());
        int cheeseburgers = Integer.parseInt(cheeseBurger.getText());
        int ranchburgers = Integer.parseInt(RanchBurger.getText());
        int bbqburgers = Integer.parseInt(BBQBurger.getText());

        int grilleds = Integer.parseInt(grilled.getText());
        int ranchgrilleds = Integer.parseInt(ranchGrilled.getText());
        int bbqgrilleds = Integer.parseInt(BBQGrilled.getText());
        int cheesegrilleds = Integer.parseInt(cheeseGrilled.getText());

        //int table = Integer.parseInt(c.getSelectionModel().toString());

        Dishes dish = new FriedChicken();
        Dishes dish1 = new CheeseBurger();
        Dishes dish2 = new GrilledChicken();
        if (frieds > 0) {

            for (int i=0;i<cheeseFrieds;i++) {
                dish = new Cheese(dish);
            }
            for (int i=0;i<bbqfrieds;i++) {
                dish = new BBQ(dish);

            }
            for (int i=0;i<ranchfrieds;i++) {
                dish = new Ranch(dish);
            }
        }

        if (burgers > 0) {

            for (int i=0; i<cheeseburgers;i++) {
                dish1 = new Cheese(dish1);
            }
            for (int i=0;i<ranchburgers;i++) {
                dish1 = new Ranch(dish1);

            }
            for (int i=0;i<bbqburgers;i++) {
                dish1 = new BBQ(dish1);
            }

            if (grilleds > 0 ) {

                for (int i=0;i<cheesegrilleds;i++) {
                    dish2 = new Cheese(dish2);
                }
                for (int i=0;i<ranchgrilleds;i++) {
                    dish2 = new Ranch(dish2);

                }
                for (int i=0; i< bbqgrilleds; i++) {
                    dish2 = new BBQ(dish2);
                }
            }
        }
        ArrayList<Dishes> dishes = new ArrayList<Dishes>();

        dishes.add(dish);
        dishes.add(dish1);
        dishes.add(dish2);

        RestaurantSingleton.getRestaurantSingleton().tablesList.get(0).setDishes(dishes);
        //cost.setText(RestaurantSingleton.getRestaurantSingleton().tablesList.get(0).getDishes().get(0).getComponents());

        String t=c.getSelectionModel().getSelectedItem().toString(); //combobox
        int i = Integer.parseInt(t);


        //String comp = RestaurantSingleton.getRestaurantSingleton().tablesList.get(i).getDishes().get(0).getComponents();
        //String comp2 =RestaurantSingleton.getRestaurantSingleton().tablesList.get(i).getDishes().get(1).getComponents();
        //String comp3 =RestaurantSingleton.getRestaurantSingleton().tablesList.get(i).getDishes().get(2).getComponents();

       String comp = RestaurantSingleton.getRestaurantSingleton().tablesList.get(0).getDishes().get(0).getComponents();

//        double totalcost = RestaurantSingleton.getRestaurantSingleton().tablesList.get(i).getDishes().get(0).cost() + RestaurantSingleton.getRestaurantSingleton().tablesList.get(i).getDishes().get(1).cost() + RestaurantSingleton.getRestaurantSingleton().tablesList.get(i).getDishes().get(2).cost();
    //   String total = Double.toString(totalcost);

        double totalcost = RestaurantSingleton.getRestaurantSingleton().tablesList.get(0).getDishes().get(0).cost();
        String total = Double.toString(totalcost);


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Table Number: "+ t);
        alert.setHeaderText("Total cost : " + total);
        alert.setContentText(comp);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        c.setItems(list);
    }


    @FXML
    void backtotakeorder(ActionEvent event) throws IOException{

        Parent inPlaceView = FXMLLoader.load(getClass().getResource("TakeOrderScene.fxml"));
        Scene inPlaceScene = new Scene(inPlaceView);
        //this line gets the stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(inPlaceScene);
        window.show();

    }

}

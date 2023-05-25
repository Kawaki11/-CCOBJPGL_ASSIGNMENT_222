package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinksController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    MD mountaindew = new MD();
    Coke coke = new Coke();
    IceCoffee icecoffee = new IceCoffee() ;
    Nestea nestea = new Nestea();
    Water water = new Water();

    public void initialize() {

        mountaindew.setColor("Green");
        mountaindew.setTaste("Sweet and Sour");

        coke.setColor("Black");
        coke.setTaste("Sweet");

        icecoffee.setColor("Brown");
        icecoffee.setTaste("Cold and Delicious");

        nestea.setColor("Brown");
        nestea.setTaste("Cold and Sweet");

        water.setColor("Colorless");
        water.setTaste("Plain");

        




    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Mountaindew is " + mountaindew.getColor() + " and " + mountaindew.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Coke is " + coke.getColor() + " and " + coke.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Ice Coffee is " + icecoffee.getColor() + " and " + icecoffee.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Nestea is " + nestea.getColor() + " and " + nestea.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Water is " + water.getColor() + " and " + water.getTaste());
        }

        alert.showAndWait();

    }
}
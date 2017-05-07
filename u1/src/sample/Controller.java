package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button button;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        EventHandler<ActionEvent> buttonObservator = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clicked");
            }
        };

        button.setOnAction(buttonObservator);


    }
}


// obserwator!!! lambda
package main_package.GUIVirusFX.controller;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ButtonQuitFXController {

    @FXML
    void ColorButton(ActionEvent event) {

    }

    @FXML
    void ConfirmNo(ActionEvent event) {
        try{
            final String PATH = "/main_package/GUIVirusFX/view/MainScreenFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
       
            fxmlLoader.setController(new MenuScreenFXController());
            Parent root = fxmlLoader.load();
            
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Confirm");
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void ConfirmYes(ActionEvent event) {
        Platform.exit();
    }
}

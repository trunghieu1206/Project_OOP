package main_package.GUIVirusFX.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VirusWithoutLipidEnvelopFX {

    @FXML
    void ColorButton(ActionEvent event) {

    }

    @FXML
    void returnMainMenu(ActionEvent event) {
        try{
            final String PATH = "main_packet/GUIVirusFX/view/MainScreenFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            MenuScreenFX menuScreenFX = new MenuScreenFX();
            fxmlLoader.setController(menuScreenFX);
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}


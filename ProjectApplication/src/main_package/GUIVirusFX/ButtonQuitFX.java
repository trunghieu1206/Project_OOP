package main_package.GUIVirusFX;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ButtonQuitFX {

    @FXML
    void ColorButton(ActionEvent event) {

    }

    @FXML
    void ConfirmNo(ActionEvent event) {
        try{
            final String PATH = "main_packet/GUIVirusFX/MainScreenFX.fxml";
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

    @FXML
    void ConfirmYes(ActionEvent event) {
        Platform.exit();
    }

}


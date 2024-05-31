package main_package.GUIVirusFX.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MenuScreenFX {

    @FXML
    void button1(ActionEvent event) {

    }

    @FXML
    void btnChooseTypeOfVirus(ActionEvent event) {
        try{
            final String PATH = "/main_package/GUIVirusFX/view/ChooseTypeVirus.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            ChooseTypeOfVirusFX chooseTypeOfVirusFX = new ChooseTypeOfVirusFX();
            fxmlLoader.setController(chooseTypeOfVirusFX);
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.close();
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void QuitButton(ActionEvent event) {
        try{
            final String PATH = "/main_package/GUIVirusFX/view/QuitButtonFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            ButtonQuitFX buttonQuitFX = new ButtonQuitFX();
            fxmlLoader.setController(buttonQuitFX);
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.close();
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}


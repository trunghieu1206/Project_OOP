package main_package.GUIVirusFX.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MenuScreenFXController {

    @FXML
    void button1(ActionEvent event) {

    }
    

    @FXML
    void btnChooseTypeOfVirus(ActionEvent event) {
        try{
            final String PATH = "/main_package/GUIVirusFX/view/ChooseTypeVirus.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            fxmlLoader.setController(new ChooseTypeOfVirusFX());
            Parent root = fxmlLoader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Choose Type of Virus");
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
            fxmlLoader.setController(new ButtonQuitFXController());
            
            Parent root = fxmlLoader.load();
            
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Quit");
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
package main_package.GUIVirusFX.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MenuScreenFXController {

    @FXML
    void btnHelpPressed(ActionEvent event) {
        try{
            final String PATH = "/main_package/GUIVirusFX/view/HelpMenu.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            fxmlLoader.setController(new HelpMenuController());
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
    void btnChooseTypeOfVirus(ActionEvent event) {
        try{
            final String PATH = "/main_package/GUIVirusFX/view/ChooseTypeVirus.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            fxmlLoader.setController(new ChooseTypeOfVirusFXController());
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
            Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
            stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
            stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
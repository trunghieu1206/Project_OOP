package main_package.GUIVirusFX.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ChooseTypeOfVirusFX {

    @FXML
    void Colorbutton(ActionEvent event) {

    }

    @FXML
    void btnVirusLipidEnvelop(ActionEvent event) {
        try{
            final String PATH = "/main_package/GUIVirusFX/view/VirusWithLipidEnvelopFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            
            fxmlLoader.setController(new VirusWithLipidEnvelopFXController());
            Parent root = fxmlLoader.load();
            
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Virus With Lipid Envelop");
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void btnVirusWithoutLipidEnvelop(ActionEvent event) {
        try{
            final String PATH = "/main_package/GUIVirusFX/view/VirusWithoutLipidEnvelopFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            
            fxmlLoader.setController(new VirusWithoutLipidEnvelopFXController());
            Parent root = fxmlLoader.load();
            
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Virus Without Lipid Envelop");
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    void returnMainMenu(ActionEvent event) {
        try{
            final String PATH = "/main_package/GUIVirusFX/view/MainScreenFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            
            fxmlLoader.setController(new MenuScreenFXController());
            Parent root = fxmlLoader.load();
            
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Main Screen");
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}

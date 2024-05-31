package main_package.GUIVirusFX;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChooseTypeOfVirusFX {

    @FXML
    void Colorbutton(ActionEvent event) {

    }

    @FXML
    void btnVirusLipidEnvelop(ActionEvent event) {
        try{
            final String PATH = "main_packet/GUIVirusFX/VirusWithLipidEnvelopFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            VirusWithLipidEnvelopFX virusWithLipidEnvelopFX = new VirusWithLipidEnvelopFX();
            fxmlLoader.setController(virusWithLipidEnvelopFX);
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
    void btnVirusWithoutLipidEnvelop(ActionEvent event) {
        try{
            final String PATH = "/hust/soict/GlobalICT/aims/screens/prj/VirusWithoutLipidEnvelopFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            VirusWithoutLipidEnvelopFX virusWithoutLipidEnvelopFX = new VirusWithoutLipidEnvelopFX();
            fxmlLoader.setController(virusWithoutLipidEnvelopFX);
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
    void returnMainMenu(ActionEvent event) {
        try{
            final String PATH = "/hust/soict/GlobalICT/aims/screens/prj/MainScreenFX.fxml";
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

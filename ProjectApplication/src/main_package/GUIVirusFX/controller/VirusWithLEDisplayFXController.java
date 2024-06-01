package main_package.GUIVirusFX.controller;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VirusWithLEDisplayFXController {

    @FXML
    Text informationText;

    @FXML
    Label virusLabel;
    
    public void displayLabel(String Name) {
    	virusLabel.setText(Name);
    }
    
    @FXML
    void btnReturnPressed (ActionEvent event) {
    	try{
    		final String PATH = "/main_package/GUIVirusFX/view/VirusWithLipidEnvelopFX.fxml";
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
    		fxmlLoader.setController(new VirusWithLipidEnvelopFXController());
    		Parent root = fxmlLoader.load();
        
    		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    		stage.setScene(new Scene(root));
    		stage.setTitle("Virus With Lipid Envelop");
    		stage.show();
    	}
    	catch(IOException e){
    		e.printStackTrace();
    	}
    }
    
    @FXML
    void btnShowInfoPressed(ActionEvent event) {
    	
    }
    
    void btnShowStructurePressed(ActionEvent event) {
    	
    }
}

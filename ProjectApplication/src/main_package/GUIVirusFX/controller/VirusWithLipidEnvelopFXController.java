package main_package.GUIVirusFX.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;
import main_package.VirusStorage.Part.Glycoprotein;
import main_package.VirusStorage.Part.LipidEnvelop;
import main_package.VirusStorage.VirusWithLipidEnvelop.HIV;

public class VirusWithLipidEnvelopFXController {
	
	@FXML
    void btnSarsCov2Pressed(ActionEvent event) {
    	try{
            final String PATH = "/main_package/GUIVirusFX/view/VirusWithLEDisplay.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            fxmlLoader.setController(new VirusWithLEDisplayFXController());
            Parent root = fxmlLoader.load();
            
            //Access to controller
            VirusWithLEDisplayFXController controller = fxmlLoader.getController();
            controller.displayLabel("Sar-CoV-2");
            
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
    void btnHIVPressed(ActionEvent event) {
    	try{
            final String PATH = "/main_package/GUIVirusFX/view/VirusWithLEDisplay.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            fxmlLoader.setController(new VirusWithLEDisplayFXController());
            Parent root = fxmlLoader.load();
            
            //Access to controller
            VirusWithLEDisplayFXController controller = fxmlLoader.getController();
            controller.displayLabel("HIV");
            
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
    void hivBtnPressed(ActionEvent event) {
    	// initialize HIV
    	LipidEnvelop l = new LipidEnvelop(1);
    	Glycoprotein g = new Glycoprotein("a type", 1);
    	AcidNucleic a = new AcidNucleic("a type", "a strand", 1);
    	Capsid c = new Capsid(1);
    	String disease = "disease";
    	int year = 2000;
    	String origin = "place";
    	HIV newVirus = new HIV(l, g, a, c, disease, year, origin);
    	//
    	
    	try{
            final String PATH = "/main_package/GUIVirusFX/view/SpecificVirusView.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            fxmlLoader.setController(new SpecificVirusViewController(newVirus));
            Parent root = fxmlLoader.load();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Showing Virus Information");
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
    @FXML
    void hepatitisbBtnPressed(ActionEvent event) {
    	
    }
    
    @FXML
    void flavivirusBtnPressed(ActionEvent event) {
    	
    }
    
    @FXML
    void sarscov2BtnPressed(ActionEvent event) {
    	
    }
    
    @FXML
    void returnBtnPressed(ActionEvent event) {
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
    void returnMainMenuBtnPressed(ActionEvent event) {
        try{
            final String PATH = "/main_package/GUIVirusFX/view/MainScreenFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            
            fxmlLoader.setController(new MenuScreenFXController());
            Parent root = fxmlLoader.load();
            
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.centerOnScreen();
            stage.setScene(new Scene(root));
            stage.setTitle("Main Screen");
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}


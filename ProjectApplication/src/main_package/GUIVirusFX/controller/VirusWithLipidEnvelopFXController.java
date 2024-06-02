
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
import main_package.VirusStorage.VirusWithLipidEnvelop.*;

public class VirusWithLipidEnvelopFXController {
    @FXML
    void ColorButton(ActionEvent event) {

    }
      
    @FXML
    void hivBtnPressed(ActionEvent event) {
    	// initialize HIV
    	LipidEnvelop l = new LipidEnvelop(1);
    	Glycoprotein g = new Glycoprotein("gp120, gp41", 1);
    	AcidNucleic a = new AcidNucleic("RNA", "single", 2);
    	Capsid c = new Capsid(1);
    	String disease = "HIV-AIDS";
    	int year = 1981;
    	String origin = "USA";
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
    	// initialize heptatitisB
    	LipidEnvelop l = new LipidEnvelop(1);
    	Glycoprotein g = new Glycoprotein("HBsAg", 1);
    	AcidNucleic a = new AcidNucleic("DNA", "double", 1);
    	Capsid c = new Capsid(1);
    	String disease = "Hepatitis B";
    	int year = 1885;
    	String origin = "Germany";
    	HepatitisB newVirus = new HepatitisB(l, g, a, c, disease, year, origin);
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
    void flavivirusBtnPressed(ActionEvent event) {
    	// initialize flavivirus
    	LipidEnvelop l = new LipidEnvelop(1);
    	Glycoprotein g = new Glycoprotein("E", 1);
    	AcidNucleic a = new AcidNucleic("RNA", "single", 1);
    	Capsid c = new Capsid(1);
    	String disease = "Yellow fever, Zika, West Nile...";
    	int year = 1937;
    	String origin = "Uganda";
    	Flavivirus newVirus = new Flavivirus(l, g, a, c, disease, year, origin);
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
    void sarscov2BtnPressed(ActionEvent event) {
    	// initialize sarscov2
    	LipidEnvelop l = new LipidEnvelop(1);
    	Glycoprotein g = new Glycoprotein("s1, s2", 1);
    	AcidNucleic a = new AcidNucleic("RNA", "single", 1);
    	Capsid c = new Capsid(1);
    	String disease = "Covid19";
    	int year = 2019;
    	String origin = "China";
    	SarsCov2 newVirus = new SarsCov2(l, g, a, c, disease, year, origin);
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

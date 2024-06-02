
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
import main_package.VirusStorage.VirusWithoutLipidEnvelop.*;

public class VirusWithoutLipidEnvelopFXController {

    @FXML
    void ColorButton(ActionEvent event) {

    }
    
    @FXML
    void adenovirusBtnPressed(ActionEvent event) {
    	// initialize adenovirus
    	AcidNucleic a = new AcidNucleic("DNA", "double", 1);
    	Capsid c = new Capsid(1);
    	String disease = "a wide range of illnesses and symptoms such as colds, sore throat, bronchitis, pneumonia, diarrhea, pink eye, bladder infection, ...";
    	int year = 1953;
    	String origin = "USA";
    	Adenovirus newVirus = new Adenovirus(a, c, disease, year, origin);
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
    void poliovirusBtnPressed(ActionEvent event) {
    	// initialize poliovirus
    	AcidNucleic a = new AcidNucleic("RNA", "single", 1);
    	Capsid c = new Capsid(1);
    	String disease = "Polio";
    	int year = 1789;
    	String origin = "England";
    	Poliovirus newVirus = new Poliovirus(a, c, disease, year, origin);
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
    void rhinovirusBtnPressed(ActionEvent event) {
    	// initialize rhinovirus
    	AcidNucleic a = new AcidNucleic("RNA", "single", 1);
    	Capsid c = new Capsid(1);
    	String disease = "common cold";
    	int year = 1953;
    	String origin = "USA";
    	Rhinovirus newVirus = new Rhinovirus(a, c, disease, year, origin);
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
    void rotavirusBtnPressed(ActionEvent event) {
    	// initialize rotavirus

    	AcidNucleic a = new AcidNucleic("RNA", "double", 1);
    	Capsid c = new Capsid(1);
    	String disease = "diarrhea";
    	int year = 1972;
    	String origin = "Australia";
    	Rotavirus newVirus = new Rotavirus(a, c, disease, year, origin);
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
            stage.setScene(new Scene(root));
            stage.setTitle("Main Screen");
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}

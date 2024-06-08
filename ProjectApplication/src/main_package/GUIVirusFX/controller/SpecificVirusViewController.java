package main_package.GUIVirusFX.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main_package.VirusStorage.Virus;
import main_package.VirusStorage.VirusWithLipidEnvelop.VirusWithLipidEnvelop;
import main_package.VirusStorage.VirusWithoutLipidEnvelop.VirusWithoutLipidEnvelop;

public class SpecificVirusViewController{
	private Virus virus;
	private int choice = 0; // choice = 0 means user choose to display virus information
							// choice = 1 means user choose to display virus structure
							// choice = 2 means user choose to display infection mechanism

    @FXML
    private Label virusTitle;
    
    @FXML
    private BorderPane borderPane;

   
    @FXML
    private Label virusName;
    
    @FXML
    private VBox contentVbox;
    
    public SpecificVirusViewController(Virus virus) {
    	this.virus = virus;
    }
    
    @FXML
    public void initialize() {
    	try {
    		final String CONTENT_FXML_FILE_PATH = "/main_package/GUIVirusFX/view/ShowBasicInformationVirus.fxml";
        	FXMLLoader fxmlLoader = new FXMLLoader();
        	fxmlLoader.setLocation(getClass().getResource(CONTENT_FXML_FILE_PATH));
        	
        	
        	
        	ShowBasicInformationVirusController showBasicInformationVirusController = new ShowBasicInformationVirusController(virus);
        	fxmlLoader.setController(showBasicInformationVirusController);
        	
        	AnchorPane anchorPane = new AnchorPane();
        	
        	anchorPane = fxmlLoader.load();
        	
        	showBasicInformationVirusController.setData();
        	
        	borderPane.setCenter(anchorPane);
        	
        	
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    	//change title for GUI
    	virusTitle.setText(virus.getClass().getSimpleName());
    	
    	virusName.setText(virus.getClass().getSimpleName());
    	
    }
    
    
    
    @FXML
    void returnBtnPressed(ActionEvent event) {
    	try{
    		if(this.virus instanceof VirusWithLipidEnvelop) {
            final String PATH = "/main_package/GUIVirusFX/view/VirusWithLipidEnvelopFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            
            fxmlLoader.setController(new VirusWithLipidEnvelopFXController());
            Parent root = fxmlLoader.load();
            
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Virus With Lipid Envelop");
            stage.show();
        }
    		else if(this.virus instanceof VirusWithoutLipidEnvelop) {
            final String PATH = "/main_package/GUIVirusFX/view/VirusWithoutLipidEnvelopFX.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
            
            fxmlLoader.setController(new VirusWithoutLipidEnvelopFXController());
            Parent root = fxmlLoader.load();
            
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Virus Without Lipid Envelop");
            stage.show();
        }
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
    
    @FXML 
    void showBasicInformationBtnPressed(ActionEvent event) {
    	this.choice = 0;
    	System.out.println("0");
    	try {
    		
    		final String CONTENT_FXML_FILE_PATH = "/main_package/GUIVirusFX/view/ShowBasicInformationVirus.fxml";
        	FXMLLoader fxmlLoader = new FXMLLoader();
    		fxmlLoader.setLocation(getClass().getResource(CONTENT_FXML_FILE_PATH));
        	
    		
        	ShowBasicInformationVirusController showBasicInformationVirusController = new ShowBasicInformationVirusController(virus);
        	fxmlLoader.setController(showBasicInformationVirusController);
        	
        	AnchorPane anchorPane = new AnchorPane();
        	
        	anchorPane = fxmlLoader.load();
        	
        	showBasicInformationVirusController.setData();
        	
        	borderPane.setCenter(anchorPane);
        	
        	
        	
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    }
    
    @FXML
    void showStructureBtnPressed(ActionEvent event) {
    	this.choice = 1;
    	System.out.println("1");
    	try {
    		final String CONTENT_FXML_FILE_PATH = "/main_package/GUIVirusFX/view/ShowStructureVirus.fxml";
        	FXMLLoader fxmlLoader = new FXMLLoader();
        	fxmlLoader.setLocation(getClass().getResource(CONTENT_FXML_FILE_PATH));
        	ShowStructureVirusController showStructureVirusController = new ShowStructureVirusController(virus);
        	fxmlLoader.setController(showStructureVirusController);
        	AnchorPane anchorPane = new AnchorPane();
        	
        	anchorPane = fxmlLoader.load();
        	
        	showStructureVirusController.setData();
        	
        	borderPane.setCenter(anchorPane);
        	
        	
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    }
    
    @FXML
    void showInfectionMechanismBtnPressed(ActionEvent event) {
    	this.choice = 2;
    	System.out.println("2");
    	try {
    		final String CONTENT_FXML_FILE_PATH = "/main_package/GUIVirusFX/view/ShowInfectionVirus.fxml";
        	FXMLLoader fxmlLoader = new FXMLLoader();
        	fxmlLoader.setLocation(getClass().getResource(CONTENT_FXML_FILE_PATH));
        	ShowInfectionVirusController showInfectionVirusController = new ShowInfectionVirusController(virus);
        	fxmlLoader.setController(showInfectionVirusController);
        	AnchorPane anchorPane = new AnchorPane();
        	
        	anchorPane = fxmlLoader.load();
        	
        	showInfectionVirusController.setData();
        	
        	borderPane.setCenter(anchorPane);
        	
        	
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }
    

}

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
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HelpMenuController {
	@FXML
	private BorderPane borderPane;
	
	@FXML
	private Label titleLabel;
	
	@FXML
	void initialize(ActionEvent event) {
		try {
    		final String CONTENT_FXML_FILE_PATH = "/main_package/GUIVirusFX/view/Help_Aim.fxml";
        	FXMLLoader fxmlLoader = new FXMLLoader();
        	fxmlLoader.setLocation(getClass().getResource(CONTENT_FXML_FILE_PATH));
        	Help_AimController helpAimController = new Help_AimController();
        	fxmlLoader.setController(helpAimController);
        	AnchorPane anchorPane = new AnchorPane();
        	
        	anchorPane = fxmlLoader.load();
        	
        	helpAimController.setContent();
        	
        	borderPane.setCenter(anchorPane);
        	
        	Font font = Font.font("Segoe UI",FontWeight.BOLD,FontPosture.REGULAR,46);
        	titleLabel.setText("AIMS");
        	titleLabel.setFont(font);
        	
        	
    	} catch(IOException e) {
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
	void btnAimsPressed(ActionEvent event) {
		try {
    		final String CONTENT_FXML_FILE_PATH = "/main_package/GUIVirusFX/view/Help_Aim.fxml";
        	FXMLLoader fxmlLoader = new FXMLLoader();
        	fxmlLoader.setLocation(getClass().getResource(CONTENT_FXML_FILE_PATH));
        	Help_AimController helpAimController = new Help_AimController();
        	fxmlLoader.setController(helpAimController);
        	AnchorPane anchorPane = new AnchorPane();
        	
        	anchorPane = fxmlLoader.load();
        	
        	helpAimController.setContent();
        	
        	borderPane.setCenter(anchorPane);
        	Font font = Font.font("Segoe UI",FontWeight.BOLD,FontPosture.REGULAR,46);
        	titleLabel.setText("AIMS");
        	titleLabel.setFont(font);
        	
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
	}

	@FXML
	void btnUsagePressed(ActionEvent event) {
		try {
    		final String CONTENT_FXML_FILE_PATH = "/main_package/GUIVirusFX/view/Help_Usage.fxml";
        	FXMLLoader fxmlLoader = new FXMLLoader();
        	fxmlLoader.setLocation(getClass().getResource(CONTENT_FXML_FILE_PATH));
        	Help_UsageController helpUsageController = new Help_UsageController();
        	fxmlLoader.setController(helpUsageController);
        	AnchorPane anchorPane = new AnchorPane();
        	
        	anchorPane = fxmlLoader.load();
        	
        	helpUsageController.setContent();
        	
        	borderPane.setCenter(anchorPane);
        	
        	Font font = Font.font("Segoe UI",FontWeight.BOLD,FontPosture.REGULAR,41);
        	titleLabel.setText("Basic Usage");
        	titleLabel.setFont(font);
        	
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
	}
	
}

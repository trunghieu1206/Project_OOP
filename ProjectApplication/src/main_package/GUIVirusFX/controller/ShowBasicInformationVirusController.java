package main_package.GUIVirusFX.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main_package.VirusStorage.Virus;
import main_package.VirusStorage.VirusWithLipidEnvelop.*;
import main_package.VirusStorage.VirusWithoutLipidEnvelop.*;

public class ShowBasicInformationVirusController {
	private Virus virus;

    @FXML
    private Label virusInformationDisplay;
    
    @FXML
    private ImageView virusImage;
    
    public ShowBasicInformationVirusController(Virus virus) {
    	this.virus = virus;
    }
    
    public void setData() {
    	virusInformationDisplay.setText(this.virus.displayInformation(virus));
    	if(this.virus instanceof HIV) {
    		Image HIV = new Image(getClass().getResourceAsStream("../image/HIVicon.png"));
        	virusImage.setImage(HIV);
    	}
    	else if(this.virus instanceof SarsCov2) {
    		Image HIV = new Image(getClass().getResourceAsStream("../image/Sars-CoV2icon.png"));
        	virusImage.setImage(HIV);
    	}
    	else if(this.virus instanceof Flavivirus) {
    		Image HIV = new Image(getClass().getResourceAsStream("../image/FlavivirusIcon.png"));
        	virusImage.setImage(HIV);
    	}
    	else if(this.virus instanceof HepatitisB) {
    		Image HIV = new Image(getClass().getResourceAsStream("../image/HepatitisBicon.png"));
        	virusImage.setImage(HIV);
    	}else if(this.virus instanceof Adenovirus) {
    		Image HIV = new Image(getClass().getResourceAsStream("../image/AdenovirusIcon.png"));
        	virusImage.setImage(HIV);
    	}else if(this.virus instanceof Poliovirus) {
    		Image HIV = new Image(getClass().getResourceAsStream("../image/PolioVirusIcon.png"));
        	virusImage.setImage(HIV);
    	}else if(this.virus instanceof Rhinovirus) {
    		Image HIV = new Image(getClass().getResourceAsStream("../image/RhinovirusIcon.png"));
        	virusImage.setImage(HIV);
    	}else if(this.virus instanceof Rotavirus) {
    		Image HIV = new Image(getClass().getResourceAsStream("../image/RotavirusIcon.png"));
        	virusImage.setImage(HIV);
    	}
    	
    	// do remaining virus classes
    }
    

}


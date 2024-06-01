package main_package.GUIVirusFX.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import main_package.VirusStorage.Virus;
import main_package.VirusStorage.VirusWithLipidEnvelop.*;

public class ShowBasicInformationVirusController {
	private Virus virus;

    @FXML
    private Label virusInformationDisplay;
    
    
    public ShowBasicInformationVirusController(Virus virus) {
    	this.virus = virus;
    }
    
    public void setData() {
    	if(this.virus instanceof HIV) {
    		virusInformationDisplay.setText(this.virus.displayInformation(virus));
    	}
    	else if(this.virus instanceof SarsCov2) {
    		virusInformationDisplay.setText(this.virus.displayInformation(virus));
    	}
    	else if(this.virus instanceof Flavivirus) {
    		//do flavivirus
    	}
    	// do remaining virus classes
    }
    

}


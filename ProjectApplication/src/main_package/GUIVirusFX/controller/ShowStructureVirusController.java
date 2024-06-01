package main_package.GUIVirusFX.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import main_package.VirusStorage.Virus;
import main_package.VirusStorage.VirusWithLipidEnvelop.*;

public class ShowStructureVirusController {
	private Virus virus;

    @FXML
    private Label virusStructure;
    
    public ShowStructureVirusController(Virus virus) {
    	this.virus = virus;
    }
    
    public void setData() {
    	if(this.virus instanceof HIV) {
    		virusStructure.setText(this.virus.displayStructure(virus));
    	}
    	else if(this.virus instanceof SarsCov2) {
    		
    	}
    }
    
    

}


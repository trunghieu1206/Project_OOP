package main_package.GUIVirusFX.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import main_package.VirusStorage.Virus;
import main_package.VirusStorage.VirusWithLipidEnvelop.HIV;

public class ShowInfectionVirusController {
	private Virus virus;

    @FXML
    private Label infectionMechanism;
    
    public ShowInfectionVirusController(Virus virus) {
    	this.virus = virus;
    }
    
    public void setData() {
    	if(this.virus instanceof HIV) {
    		
    	}
    }

}


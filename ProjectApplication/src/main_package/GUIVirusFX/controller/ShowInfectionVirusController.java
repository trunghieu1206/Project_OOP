package main_package.GUIVirusFX.controller;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import main_package.VirusStorage.Virus;
import main_package.VirusStorage.VirusWithLipidEnvelop.HIV;

public class ShowInfectionVirusController {
	private Virus virus;
	
	@FXML
    private Button controlButton;

    @FXML
    private Label labelAssemble;

    @FXML
    private Label labelAttachToHostCell;

    @FXML
    private Label labelEntryIntoHostCell;

    @FXML
    private Label labelInfectToNewCell;

    @FXML
    private Label labelRelease;

    @FXML
    private Label labelReplicateGene;

    @FXML
    private Label infectionMechanism;
    
    public ShowInfectionVirusController(Virus virus) {
    	this.virus = virus;
    }
    
    public void setData() {
    	if(this.virus instanceof HIV) {
    		
    	}
    }
    
    @FXML
    void btnControlButtonPressed(ActionEvent event) {
    	
    }

}


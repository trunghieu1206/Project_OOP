package main_package.GUIVirusFX.controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import main_package.VirusStorage.Virus;
import main_package.VirusStorage.VirusWithLipidEnvelop.*;
import main_package.VirusStorage.VirusWithoutLipidEnvelop.*;

public class ShowInfectionVirusController {
	private Virus virus;
	private int stepCnt = 1;
	
    public ShowInfectionVirusController(Virus virus) {
    	this.virus = virus;
    }
    
    @FXML
    private Label stepNumber;
    
    @FXML
    private Label infectionMechanism;

    @FXML
    private ImageView infectionStepImage;

    @FXML
    void nextStepPressed(ActionEvent event) {
    	if(this.stepCnt ==6) {
    	} else {
    		if(this.stepCnt==1) {
    			
    				stepNumber.setText("Step 2");
    				infectionMechanism.setText(this.virus.entryIntoHostCell());
    				stepCnt=stepCnt+1;
    			
    		}
    		else if(this.stepCnt==2) {
    			
    				stepNumber.setText("Step 3");
    				infectionMechanism.setText(this.virus.replicateGene());
    				stepCnt++;
    			
    		}
    		else if(this.stepCnt==3) {
    			
    				stepNumber.setText("Step 4");
    				infectionMechanism.setText(this.virus.assemble());
    				stepCnt++;
    			
    		}
    		else if(this.stepCnt==4) {
    			
    				stepNumber.setText("Step 5");
    				infectionMechanism.setText(this.virus.release());
    				stepCnt++;
    			
    		}
    		
    		else if(this.stepCnt==5) {
    			
    				stepNumber.setText("Step 6");
    				infectionMechanism.setText(this.virus.infectToNewCells());
    				stepCnt++;
    			
    		}
    		
    		
    	}
    }

    @FXML
    void previousStepPressed(ActionEvent event) {
    	if(stepCnt ==1) {
    	} else {
    		if(stepCnt==2) {
    		 
    				stepNumber.setText("Step 1");
    				infectionMechanism.setText(this.virus.attachToHostCell());
    				stepCnt--;
    			
    		}
    		else if(stepCnt==3) {
    			
    				stepNumber.setText("Step 2");
    				infectionMechanism.setText(this.virus.entryIntoHostCell());
    				stepCnt--;
    			
    		}
    		else if(stepCnt==4) {
    			
    				stepNumber.setText("Step 3");
    				infectionMechanism.setText(this.virus.replicateGene());
    				stepCnt--;
    			
    		}
    		else if(stepCnt==5) {
    			
    				stepNumber.setText("Step 4");
    				infectionMechanism.setText(this.virus.assemble());
    				stepCnt--;
    			
    		}
    		
    		else if(stepCnt==6) {
    			
    				stepNumber.setText("Step 5");
    				infectionMechanism.setText(this.virus.release());
    				stepCnt--;
    			
    		}
    		
    		
    	}
    }
    
    public void setData() {
    	stepNumber.setText("Step 1");
    	infectionMechanism.setText(this.virus.attachToHostCell());

    }
    
}


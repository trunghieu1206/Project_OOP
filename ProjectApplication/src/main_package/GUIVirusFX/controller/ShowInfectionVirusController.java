package main_package.GUIVirusFX.controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
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
    				if (this.virus instanceof VirusWithLipidEnvelop) {
    		    		Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step2_fin_fin.png"));
    		    		infectionStepImage.setImage(img);
    		    	}
    				else if (this.virus instanceof VirusWithoutLipidEnvelop) {
    					Image img = new Image(getClass().getResourceAsStream("../image/infection process virus without lipid envelope/Step2_fin.png"));
    					infectionStepImage.setImage(img);
    				}
    				stepCnt=stepCnt+1;
    			
    		}
    		else if(this.stepCnt==2) {
    			
    				stepNumber.setText("Step 3");
    				infectionMechanism.setText(this.virus.replicateGene());
    				Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step3(replicate).jpg"));
		    		infectionStepImage.setImage(img);
    				stepCnt++;
    			
    		}
    		else if(this.stepCnt==3) {
    			
    				stepNumber.setText("Step 4");
    				infectionMechanism.setText(this.virus.assemble());
    				Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step4(assemble).jpg"));
		    		infectionStepImage.setImage(img);
    				stepCnt++;
    			
    		}
    		else if(this.stepCnt==4) {
    			
    				stepNumber.setText("Step 5");
    				infectionMechanism.setText(this.virus.release());
    				Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step5(release).jpg"));
		    		infectionStepImage.setImage(img);
    				stepCnt++;
    			
    		}
    		
    		else if(this.stepCnt==5) {
    			
    				stepNumber.setText("Step 6");
    				infectionMechanism.setText(this.virus.infectToNewCells());
    				Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step6(infect_to_new_cell).jpg"));
		    		infectionStepImage.setImage(img);
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
    				if (this.virus instanceof VirusWithLipidEnvelop) {
    		    		Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step1.jpg"));
    		    		infectionStepImage.setImage(img);
    				}
    				else if (this.virus instanceof VirusWithoutLipidEnvelop) {
    					Image img = new Image(getClass().getResourceAsStream("../image/infection process virus without lipid envelope/Step1.png"));
    					infectionStepImage.setImage(img);
    				}
    				stepCnt--;
    			
    		}
    		else if(stepCnt==3) {
    			
    				stepNumber.setText("Step 2");
    				infectionMechanism.setText(this.virus.entryIntoHostCell());
    				if (this.virus instanceof VirusWithLipidEnvelop) {
    		    		Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step2_fin_fin.png"));
    		    		infectionStepImage.setImage(img);
    				}
    				else if (this.virus instanceof VirusWithoutLipidEnvelop) {
    					Image img = new Image(getClass().getResourceAsStream("../image/infection process virus without lipid envelope/Step2_fin.png"));
    					infectionStepImage.setImage(img);
    				}
    				stepCnt--;
    			
    		}
    		else if(stepCnt==4) {
    			
    				stepNumber.setText("Step 3");
    				infectionMechanism.setText(this.virus.replicateGene());
    				Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step3(replicate).jpg"));
		    		infectionStepImage.setImage(img);
    				stepCnt--;
    			
    		}
    		else if(stepCnt==5) {
    			
    				stepNumber.setText("Step 4");
    				infectionMechanism.setText(this.virus.assemble());
    				Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step4(assemble).jpg"));
		    		infectionStepImage.setImage(img);
    				stepCnt--;
    			
    		}
    		
    		else if(stepCnt==6) {
    			
    				stepNumber.setText("Step 5");
    				infectionMechanism.setText(this.virus.release());
    				Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step5(release).jpg"));
		    		infectionStepImage.setImage(img);
    				stepCnt--;
    			
    		}
    		
    		
    	}
    }
    
    public void setData() {
    	stepNumber.setText("Step 1");
    	infectionMechanism.setText(this.virus.attachToHostCell());
    	if (this.virus instanceof VirusWithLipidEnvelop) {
    		Image img = new Image(getClass().getResourceAsStream("../image/infection process  virus with lipid envelop/fin/step1.jpg"));
    		infectionStepImage.setImage(img);
    	}
    	else if (this.virus instanceof VirusWithoutLipidEnvelop) {
			Image img = new Image(getClass().getResourceAsStream("../image/infection process virus without lipid envelope/Step1.png"));
			infectionStepImage.setImage(img);
    	}
    }
    
}


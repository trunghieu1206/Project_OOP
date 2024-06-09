package main_package.GUIVirusFX.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main_package.VirusStorage.Virus;
import main_package.VirusStorage.VirusWithLipidEnvelop.*;
import main_package.VirusStorage.VirusWithoutLipidEnvelop.Adenovirus;
import main_package.VirusStorage.VirusWithoutLipidEnvelop.Poliovirus;
import main_package.VirusStorage.VirusWithoutLipidEnvelop.Rhinovirus;
import main_package.VirusStorage.VirusWithoutLipidEnvelop.Rotavirus;


public class ShowStructureVirusController {
	private Virus virus;

    @FXML
    private Label virusStructure;
    
    @FXML
    private ImageView virusStructureImage;
    
    public ShowStructureVirusController(Virus virus) {
    	this.virus = virus;
    }
    
    public void setData() {
    	virusStructure.setText(this.virus.displayStructure(virus));
    	if(this.virus instanceof HIV) {
    		Image viruStruct = new Image(getClass().getResourceAsStream("../image/Hiv_stuct_icon.png"));
        	virusStructureImage.setImage(viruStruct);
    	}
    	else if(this.virus instanceof SarsCov2) {
    		Image viruStruct = new Image(getClass().getResourceAsStream("../image/sarcov2_struct_icon.png"));
        	virusStructureImage.setImage(viruStruct);
    	}
    	else if(this.virus instanceof Flavivirus) {
    		Image viruStruct = new Image(getClass().getResourceAsStream("../image/flavivirus_struct_icon.png"));
        	virusStructureImage.setImage(viruStruct);
    	}
    	else if(this.virus instanceof HepatitisB) {
    		Image viruStruct = new Image(getClass().getResourceAsStream("../image/hepatitisb_struct_icon.png"));
        	virusStructureImage.setImage(viruStruct);
    	}else if(this.virus instanceof Adenovirus) {
    		Image viruStruct = new Image(getClass().getResourceAsStream("../image/adeno_struct_icon.png"));
        	virusStructureImage.setImage(viruStruct);
    	}else if(this.virus instanceof Poliovirus) {
    		Image viruStruct = new Image(getClass().getResourceAsStream("../image/poliovirus_struct_icon.png"));
        	virusStructureImage.setImage(viruStruct);
    	}else if(this.virus instanceof Rhinovirus) {
    		Image viruStruct = new Image(getClass().getResourceAsStream("../image/rhinovirus_struct_icon.png"));
        	virusStructureImage.setImage(viruStruct);
    	}else if(this.virus instanceof Rotavirus) {
    		Image viruStruct = new Image(getClass().getResourceAsStream("../image/rota_struct_icon.png"));
        	virusStructureImage.setImage(viruStruct);
    	}
    	
    	// do remaining virus classes
    }
    
    

}


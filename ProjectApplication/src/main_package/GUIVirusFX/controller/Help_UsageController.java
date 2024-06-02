package main_package.GUIVirusFX.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Help_UsageController {
	@FXML
	private Label aimLabel;
	
	public void setContent() {
		aimLabel.setText("Something-Usage");
	}
}

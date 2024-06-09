package main_package.GUIVirusFX.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Help_AimController {
	@FXML
	private Label aimLabel;
	
	public void setContent() {
		aimLabel.setText("  The aim of the Virus Information Application is to provide comprehensive, accurate, and up-to-date information on various viruses to enhance public awareness, support health professionals, and assist in the prevention and management of viral diseases. This application serves several key purposes:\r\n"
				+ "  1. Education and Awareness: Educate the general public about different types of viruses, their transmission methods, symptoms, and preventive measures. By disseminating reliable information, the application empowers users to take proactive steps in safeguarding their health.\r\n"
				+ "  2. User-Friendly Interface: Ensure that the application is accessible and easy to navigate for users of all ages and technical abilities. A clear and intuitive interface enhances the user experience and ensures that information is easily accessible.\r\n"
				+ "  By integrating these features, the Virus Information Application aims to be a comprehensive tool in the fight against viral diseases, fostering a well-informed public and a responsive healthcare community.\r\n"
				+ "");
	}
}

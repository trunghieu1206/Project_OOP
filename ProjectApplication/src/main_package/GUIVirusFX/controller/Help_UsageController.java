package main_package.GUIVirusFX.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Help_UsageController {
	@FXML
	private Label aimLabel;
	
	public void setContent() {
		aimLabel.setText("1. Main Screen:\r\n"
				+ "     a. Choose Type of Virus: Choose the type of virus you want to get information about. There are two types of viruses: virus with lipid envelope and virus without lipid envelope.\r\n"
				+ "     b. Help: View information about the application and basic instructions.\r\n"
				+ "     c. Quit: Exit the program.\r\n"
				+ "\r\n"
				+ "2. Choose Virus Type:\r\n"
				+ "   - When \"Choose Virus Type\" button clicked, a list will appear with two types of viruses:\r\n"
				+ "     a. Virus with lipid envelope.\r\n"
				+ "     b. Virus without lipid envelope.\r\n"
				+ "   - Select one of the virus types to display specific virus options accordingly.\r\n"
				+ "\r\n"
				+ "3. Select a specific virus\r\n"
				+ "   - After selecting a specific virus type, the program will display a list of viruses belonging to that type. For example:\r\n"
				+ "     a. Virus With Lipid Envelope: HIV, Sar Cov2, Hepatitis B, Flavivirus.\r\n"
				+ "     b. Virus Without Lipid Envelope: Poliovirus, Rotavirus, Adenovirus, Rhinovirus.\r\n"
				+ "   - Clicking on each virus will reveal three functions:\r\n"
				+ "     a. Show Basic Information of Virus: Displays basic information about the selected virus.\r\n"
				+ "     b. Show Structure of Virus: Displays the structure of the selected virus.\r\n"
				+ "     c. Show Infection of Virus: Displays the process of disease infection of the selected virus.\r\n"
				+ "\r\n"
				+ "4. Help:\r\n"
				+ "   - Clicking the \"Help\" button will open a window displaying information about the application and basic usage instructions.\r\n"
				+ "\r\n"
				+ "5. Exit:\r\n"
				+ "   - When \"Quit\" button clicked, a prompt will appear with two options: \"Yes\" or \"No\".\r\n"
				+ "   - Selecting \"No\" will return to the main screen.\r\n"
				+ "   - Selecting \"Yes\" will automatically exit the program.\r\n"
				+ "\r\n"
				+ "");
	}
}

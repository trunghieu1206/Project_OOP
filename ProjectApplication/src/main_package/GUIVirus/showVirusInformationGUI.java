package main_package.GUIVirus;

import main_package.VirusStorage.VirusWithLipidEnvelop.*;
import main_package.VirusStorage.Part.*;
import main_package.VirusStorage.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class showVirusInformationGUI extends JFrame{
	Virus virus;
	
	public showVirusInformationGUI(Virus virus) {
		this.virus = virus;
		//GUI here ..
		
		
		
		if(virus instanceof HIV) {
			//GUI for HIV
			
			
			
		}
		else if(virus instanceof SarsCov2) {
			//GUI for SarsCov2
			
			
		}
		else if(virus instanceof HepatitisB) {
			//GUI for HepatitisB
			
			
		}
		else if(virus instanceof Flavivirus) {
			//GUI for Flavivirus
			
			
			
		}
		
		
		
	}
	
	
}

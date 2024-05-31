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


public class showHIV extends showVirus{
	HIV newVirus;
	
	JPanel createCenter(){
		ButtonListener btnListener = new ButtonListener();
		
		
		JFrame.setDefaultLookAndFeelDecorated(true);
        JPanel center = new JPanel();
        
        
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
        center.setAlignmentX(Component.CENTER_ALIGNMENT);
              
        JButton showInformationbtn = new JButton("Show virus information");
        showInformationbtn.addActionListener(btnListener);
        
        
        JButton showStructurebtn = new JButton("Show structure of virus");
        showStructurebtn.addActionListener(btnListener);
        
        JButton viewInfectionMechanismbtn = new JButton("Show infection mechanism of virus");
        viewInfectionMechanismbtn.addActionListener(btnListener);
        
        center.add(showInformationbtn);
        center.add(showStructurebtn);
        center.add(viewInfectionMechanismbtn);
       
        return center;
        
    }
	
	public showHIV() {
		super();
		
		
		// initialize an instance of this type of virus to show information
		LipidEnvelop l = new LipidEnvelop(1);
    	Glycoprotein g = new Glycoprotein("a type", 1);
    	AcidNucleic a = new AcidNucleic("a type", "a strand", 1);
    	Capsid c = new Capsid(1);
    	String disease = "disease";
    	int year = 2000;
    	String origin = "place";
    	newVirus = new HIV(l, g, a, c, disease, year, origin);
    	//
    	
    	
	}
	
	private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if(button.equals("Return")){
            	dispose();
                new VirusWithLipidEnvelopGUI();
            }
            else if(button.equals("Show virus information")) {
            	newVirus.displayInformation(newVirus);
            	//new showVirusInformationGUI(newVirus);
            }
            else if(button.equals("Show structure of virus")) {
            	newVirus.displayStructure(newVirus);
            	//new showStructureGUI(newVirus);
            }
            else if(button.equals("Show infection mechanism of virus")) {
            	newVirus.displayInfectionProcess();
            	//new showInfectionProcessGUI(newVirus);
            }
        }
    }
	
	
	
	public static void main(String[] args) {
		new showHIV();
	}
}

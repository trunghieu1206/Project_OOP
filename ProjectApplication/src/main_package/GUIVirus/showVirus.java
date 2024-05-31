package main_package.GUIVirus;

import main_package.VirusStorage.VirusWithLipidEnvelop.*;
import main_package.VirusStorage.Part.*;
import main_package.VirusStorage.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class showVirus extends JFrame{
	
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

    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        
        JLabel title = new JLabel(this.getClass().getSimpleName().substring(4));
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 40));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10,10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10,10)));

        return header;
    }

    JPanel createReturnButton(){
        ButtonListener btnListener = new ButtonListener();
        JPanel returnButton = new JPanel();
        returnButton.setLayout(new BoxLayout(returnButton, BoxLayout.X_AXIS));
        JButton button = new JButton("Return");
        button.addActionListener(btnListener);
        button.setSize(100,50);

        returnButton.add(Box.createRigidArea(new Dimension(260,50)));
        returnButton.add(button);
        returnButton.add(Box.createHorizontalGlue());
        returnButton.add(Box.createRigidArea(new Dimension(50,50)));

        return returnButton;
    }
	
	public showVirus() {
    	
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(createReturnButton(), BorderLayout.SOUTH);
        this.add(createCenter(), BorderLayout.CENTER);
        this.add(createHeader(), BorderLayout.NORTH);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
	}
	
	private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if(button.equals("Return")){
            	dispose();
                new VirusWithLipidEnvelopGUI();
            }
        }
	
	}
}

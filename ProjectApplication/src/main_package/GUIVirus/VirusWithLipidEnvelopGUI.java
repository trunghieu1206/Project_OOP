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

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VirusWithLipidEnvelopGUI extends JFrame{

    JPanel createCenter(){
    	ButtonListener btnListener = new ButtonListener();
    	
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(2,2,2,2));

        
        //Add HIV button
        JButton btn = new JButton("HIV");
        btn.addActionListener(btnListener);
        center.add(btn);
        
        //Add SarsCov2 button
        btn = new JButton("Sars Cov 2");
        btn.addActionListener(btnListener);
        center.add(btn);
        
       //Add HepatitisB button
        btn = new JButton("Hepatitis B");
        btn.addActionListener(btnListener);
        center.add(btn);   
        
        //add Flavivirus
        btn = new JButton("Flavivirus");
        btn.addActionListener(btnListener);
        center.add(btn);
        
        return center;
        
    }

    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        JLabel title = new JLabel("Virus With Lipid Envelop");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 40));
        title.setForeground(Color.GRAY);

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

    public VirusWithLipidEnvelopGUI(){

        // Container cp = getContentPane();
        // cp.setLayout(new BorderLayout());
        // cp.add(createCenter(), BorderLayout.CENTER);
        // cp.add(createHeader(), BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(createReturnButton(), BorderLayout.SOUTH);
        this.add(createCenter(), BorderLayout.CENTER);
        this.add(createHeader(), BorderLayout.NORTH);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if(button.equals("Return")){
            	dispose();
                new ChooseTypeOfVirusScreen();
            }
            else if(button.equals("HIV")) {
            	dispose();
            	new showHIV();
            	
            }
            else if(button.equals("Sars Cov 2")) {
            	
            }
            else if(button.equals("Hepatitis B")) {
            	
            }
            else if(button.equals("Flavivirus")) {
            	
            }
        }
    }

    public static void main(String[] args) {
        new VirusWithLipidEnvelopGUI();
    }
}

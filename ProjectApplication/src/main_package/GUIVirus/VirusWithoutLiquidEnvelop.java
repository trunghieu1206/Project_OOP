package main_package.GUIVIrus;

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

public class VirusWithoutLiquidEnvelop extends JFrame{

    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(2,2,2,2));

        for(int i=0; i<4; i++){
            JButton button = new JButton("Hello");
            center.add(button);
        }
        return center;
    }

    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        JLabel title = new JLabel("Virus Without Liquid Envelop");
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
        // button.setBounds(250, 300, 100, 50);
        button.setSize(100,50);

        returnButton.add(Box.createRigidArea(new Dimension(260,50)));
        returnButton.add(button);
        returnButton.add(Box.createHorizontalGlue());
        returnButton.add(Box.createRigidArea(new Dimension(50,50)));

        return returnButton;
    }

    public VirusWithoutLiquidEnvelop(){

        // Container cp = getContentPane();
        // cp.setLayout(new BorderLayout());
        // cp.add(createCenter(), BorderLayout.CENTER);
        // cp.add(createHeader(), BorderLayout.NORTH);
        
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(createHeader(), BorderLayout.NORTH);
        this.add(createCenter(), BorderLayout.CENTER);
        this.add(createReturnButton(), BorderLayout.SOUTH);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if(button.equals("Return")){
                new ChooseTypeOfVirussScreen();
            }
        }
    }

    public static void main(String[] args) {
        new VirusWithoutLiquidEnvelop();
    }
}

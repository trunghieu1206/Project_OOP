package main_package.GUIVirus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChooseTypeOfVirusScreen extends JFrame{
    public ChooseTypeOfVirusScreen(){
        ButtonListener btnListener = new ButtonListener();
        // this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JButton button1 = new JButton("Virus With Lipid Envelop");
        button1.setBounds(200, 50 , 200, 50);
        button1.addActionListener(btnListener);
        JButton button2 = new JButton("Virus Without Lipid Envelop");
        button2.setBounds(200, 150, 200, 50);
        button2.addActionListener(btnListener);
        JButton button3 = new JButton("Return");
        button3.setBounds(200, 250, 200, 50);
        button3.addActionListener(btnListener);

        this.add(button1);
        this.add(button2);
        this.add(button3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
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
                new MainScreen();
            }
            else if(button.equals("Virus With Lipid Envelop")){
            	dispose();
                new VirusWithLipidEnvelopGUI();
            }
            else if(button.equals("Virus Without Lipid Envelop")){
            	dispose();
                new VirusWithoutLipidEnvelopGUI();
            }
        }
    }
    public static void main(String[] args) {
        new ChooseTypeOfVirusScreen();
    }
}

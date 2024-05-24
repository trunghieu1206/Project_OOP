package main_package.GUIVirus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class QuitButton extends JFrame {
    public QuitButton(){
        ButtonListener btnListener = new ButtonListener();
        // this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JButton button1 = new JButton("YES");
        button1.setBounds(250, 100 , 100, 50);
        button1.addActionListener(btnListener);
        JButton button2 = new JButton("NO");
        button2.setBounds(250, 200, 100, 50);
        button2.addActionListener(btnListener);

        this.add(button1);
        this.add(button2);

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
            if(button.equals("NO")){
            	dispose();
                new MainScreen();
            }
            else{
                System.exit(0);
            }
        }
    }
}

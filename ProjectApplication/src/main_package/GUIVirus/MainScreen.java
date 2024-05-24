package main_package.GUIVirus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;;

public class MainScreen extends JFrame{
    //private Virus virus;

    JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        //north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        JLabel title = new JLabel("Virus Program");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10,10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10,10)));

        return header;
    }

    JButton createButton1(){
        ButtonListener btnListener = new ButtonListener();
        JButton button1 = new JButton("Choose Type Of Virus");
        button1.addActionListener(btnListener);
        button1.setBounds(200, 50, 200, 50);
        //button1.setSize(200, 100);
        button1.setVisible(true);

        return button1;
    }

    JButton createButton2(){
        JButton button2 = new JButton("Help");
        button2.setBounds(200, 150, 200, 50);
        //button2.setSize(200, 100);
        button2.setVisible(true);

        return button2;
    }

    JButton createButton3(){
        ButtonListener btnListener = new ButtonListener();
        JButton button3 = new JButton("Quit");
        button3.addActionListener(btnListener);
        button3.setBounds(200, 250, 200, 50);
        //button3.setSize(200, 100);
        button3.setVisible(true);

        return button3;
    }

    public MainScreen() {
        ButtonListener btnListener = new ButtonListener();
        //this.virus = virus;

        // Container cp = getContentPane();
        // cp.setLayout(new SpringLayout());
        // cp.add(createHeader(), BorderLayout.NORTH);

        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        //Border border = BorderFactory.createLineBorder(Color.green, 3);
        ImageIcon img = new ImageIcon("images.png");

        label.setIcon(img);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0, 0, 600, 400);
        //label.setBorder(border);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Virus Program");
        //this.add(label);

        JButton button1 = createButton1();
        //button1.addActionListener(btnListener);
        JButton button2 = createButton2();
        JButton button3 = createButton3();
        this.add(button1);
        this.add(button2);
        this.add(button3);
        //this.pack();

        // JPanel panelButtons = new JPanel(new GridLayout(3,1));
        // panelButtons.add(button1);
        // panelButtons.add(button2);
        // panelButtons.add(button3);
        // cp.add(panelButtons);

        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if(button.equals("Choose Type Of Virus")){
            	dispose();
                new ChooseTypeOfVirusScreen();
            }
            else if(button.equals("Quit")){
            	dispose();
                new QuitButton();
            }
        }
    }

    public static void main(String[] args) {
        new MainScreen();
    }
}

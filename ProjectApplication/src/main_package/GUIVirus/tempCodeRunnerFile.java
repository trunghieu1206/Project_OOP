private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if(button.equals("Choose Type Of Virus")){
                new ChooseTypeOfVirussScreen();
            }
            else if(button.equals("Quit")){
                new QuitButton();
            }
        }
    }
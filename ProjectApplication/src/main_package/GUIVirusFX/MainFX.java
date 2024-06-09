package main_package.GUIVirusFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main_package.GUIVirusFX.controller.MenuScreenFXController;

public class MainFX extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        final String PATH = "/main_package/GUIVirusFX/view/MainScreenFX.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
        MenuScreenFXController menuScreenFXController = new MenuScreenFXController();
        fxmlLoader.setController(menuScreenFXController);
        Parent root = fxmlLoader.load();
        
        stage.setTitle("Main Screen");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

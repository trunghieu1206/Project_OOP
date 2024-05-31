package main_package.GUIVirusFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main_package.GUIVirusFX.controller.MenuScreenFX;

public class MainFX extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        final String PATH = "main_package/GUIVirusFX/view/MainScreenFX.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PATH));
        MenuScreenFX menuScreenFX = new MenuScreenFX();
        fxmlLoader.setController(menuScreenFX);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.close();
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

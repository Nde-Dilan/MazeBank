package com.mazebank.mazebank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.setAlwaysOnTop(true);

        stage.show();
    }
}

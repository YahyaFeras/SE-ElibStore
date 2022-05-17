package com.example.seelibstore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class ElibStore  extends Application {

    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Homepage-View.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("css/ElibstoreStyle.css").toExternalForm());
        stage.setTitle("Hotel Management System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch();}
}


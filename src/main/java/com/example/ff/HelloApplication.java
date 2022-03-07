package com.example.ff;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;



public class HelloApplication extends Application {
    @Override
    public void start(Stage stage1) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 900, 600);
        stage1.setTitle("Sign in!");
        stage1.setScene(scene1);
        stage1.setResizable(false);
        stage1.show();
    }

    public static void main(String[] args) {
        launch();

        }

  /*     My global variables      */

  public static String globalId="";



}
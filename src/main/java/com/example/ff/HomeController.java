package com.example.ff;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private HBox homepage;

    @FXML
    private Button addStudent;
    @FXML
    private Button delete;

    @FXML
    private Button logout;

    @FXML
    void addClick(ActionEvent event) throws IOException {
        homepage.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student.fxml"));
        Scene scene4 = new Scene(fxmlLoader.load(), 900, 600);
        Stage stage4= new Stage();
        stage4.setTitle("Student Management!");
        stage4.setScene(scene4);
        stage4.setResizable(false);
        stage4.show();

    }
    @FXML
    void deleteClick(ActionEvent event) throws IOException {

        homepage.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("delete.fxml"));
        Scene scene4 = new Scene(fxmlLoader.load(), 900, 600);
        Stage stage4= new Stage();
        stage4.setTitle("Delete Student!");
        stage4.setScene(scene4);
        stage4.setResizable(false);
        stage4.show();

    }

    @FXML
    void outClick(ActionEvent event) throws IOException {
            homepage.getScene().getWindow().hide();
    }

    @FXML
    void reportClick(ActionEvent event) throws IOException {

        homepage.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("report.fxml"));
        Scene scene4 = new Scene(fxmlLoader.load(), 900, 650);
        Stage stage4= new Stage();
        stage4.setTitle("Student statistics!");
        stage4.setScene(scene4);
        stage4.setResizable(false);
        stage4.show();

    }

    @FXML
    void gradeAdd(ActionEvent event) throws IOException {
        homepage.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("grades.fxml"));
        Scene scene4 = new Scene(fxmlLoader.load(), 900, 600);
        Stage stage4= new Stage();
        stage4.setTitle("Student grades!");
        stage4.setScene(scene4);
        stage4.setResizable(false);
        stage4.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

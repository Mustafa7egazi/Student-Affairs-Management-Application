package com.example.ff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.ff.MyJDBC.*;

public class Report {

    @FXML
    private VBox gpa;

    @FXML
    private Label result;

    @FXML
    private Label grade1;

    @FXML
    private Label grade2;

    @FXML
    private Label grade3;

    @FXML
    private Label grade4;

    @FXML
    private Label grade5;

    @FXML
    private Label grade6;


    @FXML
    void onClick(ActionEvent event) {
        /* for Gpa */
        MyJDBC.searchMax();
        /*   for grades */
        MyJDBC.searchMaxC1();
        MyJDBC.searchMaxC2();
        MyJDBC.searchMaxC3();
        MyJDBC.searchMaxC4();
        MyJDBC.searchMaxC5();
        MyJDBC.searchMaxC6();

        result.setText("Name: " + Name + "   Highest GPA : " + maxGPA);

        grade1.setText("Name: " + name1 + "  \n Highest course1 score : " + MyJDBC.grade1);
        grade2.setText("Name: " + name2 + "  \nHighest course2 score : " + MyJDBC.grade2);
        grade3.setText("Name: " + name3 + "  \nHighest course3 score : " + MyJDBC.grade3);
        grade4.setText("Name: " + name4 + "  \nHighest course4 score : " + MyJDBC.grade4);
        grade5.setText("Name: " + name5 + "  \nHighest course5 score : " + MyJDBC.grade5);
        grade6.setText("Name: " + name6 + "  \nHighest course6 score : " + MyJDBC.grade6);



    }

    @FXML
    void backClick(ActionEvent event) throws IOException {
        gpa.getScene().getWindow().hide();

        Stage stage2 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
        Scene scene2 = new Scene(fxmlLoader.load(), 800, 500);
        stage2.setTitle("Home !");
        stage2.setScene(scene2);
        stage2.setResizable(false);
        stage2.show();

    }

}


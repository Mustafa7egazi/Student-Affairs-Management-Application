package com.example.ff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Grades implements Initializable {
    public static double mainGpa =0.0;

    @FXML
    private VBox grades;

    @FXML
    private TextField grade1;

    @FXML
    private TextField grade2;

    @FXML
    private TextField grade3;

    @FXML
    private TextField grade4;

    @FXML
    private TextField grade5;

    @FXML
    private TextField grade6;


    @FXML
    private TextField id;



    public double GPA() {

        double grade = 0.0, p1 = 0.0, p2 = 0.0, p3 = 0.0, p4 = 0.0, p5 = 0.0, p6 = 0.0, gpa = 0.0;

        if (grade1.getText().isEmpty() || grade2.getText().isEmpty() || grade3.getText().isEmpty() ||
                grade4.getText().isEmpty()|| grade5.getText().isEmpty() || grade6.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required, please refill missing",
                    "Invalid operation!", 2);
        } else {

            /**********************  for course 1      ******************************/
            if ((grade = Double.parseDouble(grade1.getText())) >= 90 && (grade = Double.parseDouble(grade1.getText())) <= 100) {
                p1 = 4.0;
            } else if ((grade = Double.parseDouble(grade1.getText())) >= 85 && (grade = Double.parseDouble(grade1.getText())) <= 90) {
                p1 = 3.7;
            } else if ((grade = Double.parseDouble(grade1.getText())) >= 75 && (grade = Double.parseDouble(grade1.getText())) <= 85) {
                p1 = 3.0;
            } else if ((grade = Double.parseDouble(grade1.getText())) >= 65 && (grade = Double.parseDouble(grade1.getText())) <= 75) {
                p1 = 2.7;
            } else if ((grade = Double.parseDouble(grade1.getText())) >= 50 && (grade = Double.parseDouble(grade1.getText())) <= 65) {
                p1 = 2.0;
            }

            /**********************  for course 2      ******************************/
            if ((grade = Double.parseDouble(grade2.getText())) >= 90 && (grade = Double.parseDouble(grade2.getText())) <= 100) {
                p2 = 4.0;
            } else if ((grade = Double.parseDouble(grade2.getText())) >= 85 && (grade = Double.parseDouble(grade2.getText())) <= 90) {
                p2 = 3.7;
            } else if ((grade = Double.parseDouble(grade2.getText())) >= 75 && (grade = Double.parseDouble(grade2.getText())) <= 85) {
                p2 = 3.0;
            } else if ((grade = Double.parseDouble(grade2.getText())) >= 65 && (grade = Double.parseDouble(grade2.getText())) <= 75) {
                p2 = 2.7;
            } else if ((grade = Double.parseDouble(grade2.getText())) >= 50 && (grade = Double.parseDouble(grade2.getText())) <= 65) {
                p2 = 2.0;
            }

            /**********************  for course 3      ******************************/
            if ((grade = Double.parseDouble(grade3.getText())) >= 90 && (grade = Double.parseDouble(grade3.getText())) <= 100) {
                p3 = 4.0;
            } else if ((grade = Double.parseDouble(grade3.getText())) >= 85 && (grade = Double.parseDouble(grade3.getText())) <= 90) {
                p3 = 3.7;
            } else if ((grade = Double.parseDouble(grade3.getText())) >= 75 && (grade = Double.parseDouble(grade3.getText())) <= 85) {
                p3 = 3.0;
            } else if ((grade = Double.parseDouble(grade3.getText())) >= 65 && (grade = Double.parseDouble(grade3.getText())) <= 75) {
                p3 = 2.7;
            } else if ((grade = Double.parseDouble(grade3.getText())) >= 50 && (grade = Double.parseDouble(grade3.getText())) <= 65) {
                p3 = 2.0;
            }

            /**********************  for course 4      ******************************/
            if ((grade = Double.parseDouble(grade4.getText())) >= 90 && (grade = Double.parseDouble(grade4.getText())) <= 100) {
                p4 = 4.0;
            } else if ((grade = Double.parseDouble(grade4.getText())) >= 85 && (grade = Double.parseDouble(grade4.getText())) <= 90) {
                p4 = 3.7;
            } else if ((grade = Double.parseDouble(grade4.getText())) >= 75 && (grade = Double.parseDouble(grade4.getText())) <= 85) {
                p4 = 3.0;
            } else if ((grade = Double.parseDouble(grade4.getText())) >= 65 && (grade = Double.parseDouble(grade4.getText())) <= 75) {
                p4 = 2.7;
            } else if ((grade = Double.parseDouble(grade4.getText())) >= 50 && (grade = Double.parseDouble(grade4.getText())) <= 65) {
                p4 = 2.0;
            }

            /**********************  for course 5      ******************************/
            if ((grade = Double.parseDouble(grade5.getText())) >= 90 && (grade = Double.parseDouble(grade5.getText())) <= 100) {
                p5 = 4.0;
            } else if ((grade = Double.parseDouble(grade5.getText())) >= 85 && (grade = Double.parseDouble(grade5.getText())) <= 90) {
                p5 = 3.7;
            } else if ((grade = Double.parseDouble(grade5.getText())) >= 75 && (grade = Double.parseDouble(grade5.getText())) <= 85) {
                p5 = 3.0;
            } else if ((grade = Double.parseDouble(grade5.getText())) >= 65 && (grade = Double.parseDouble(grade5.getText())) <= 75) {
                p5 = 2.7;
            } else if ((grade = Double.parseDouble(grade5.getText())) >= 50 && (grade = Double.parseDouble(grade5.getText())) <= 65) {
                p5 = 2.0;
            }

            /**********************  for course 6      ******************************/
            if ((grade = Double.parseDouble(grade6.getText())) >= 90 && (grade = Double.parseDouble(grade6.getText())) <= 100) {
                p6 = 4.0;
            } else if ((grade = Double.parseDouble(grade6.getText())) >= 85 && (grade = Double.parseDouble(grade6.getText())) <= 90) {
                p6 = 3.7;
            } else if ((grade = Double.parseDouble(grade6.getText())) >= 75 && (grade = Double.parseDouble(grade6.getText())) <= 85) {
                p6 = 3.0;
            } else if ((grade = Double.parseDouble(grade6.getText())) >= 65 && (grade = Double.parseDouble(grade6.getText())) <= 75) {
                p6 = 2.7;
            } else if ((grade = Double.parseDouble(grade6.getText())) >= 50 && (grade = Double.parseDouble(grade6.getText())) <= 65) {
                p6 = 2.0;
            }

            gpa = ((p1 * 3) + (p2 * 3) + (p3 * 3) + (p4 * 3) + (p5 * 3) + (p6 * 3)) / 18;
            mainGpa = gpa;

        }
        return gpa;
    }



    @FXML
    void back(ActionEvent event) throws IOException {
        grades.getScene().getWindow().hide();

        Stage stage2 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
        Scene scene2 = new Scene(fxmlLoader.load(), 800, 500);
        stage2.setTitle("Home!");
        stage2.setScene(scene2);
        stage2.setResizable(false);
        stage2.show();

    }


//    @FXML
//    void submit(ActionEvent event) throws IOException {
//
//
//        boolean condition = MyJDBC.insertGrade(id.getText(), grade1.getText(), grade2.getText(), grade3.getText(), grade4.getText()
//                , grade5.getText(), grade6.getText(), GPA());
//        if (condition) {
//            grades.getScene().getWindow().hide();
//
//            Stage stage2 = new Stage();
//            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("grades.fxml"));
//            Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
//            stage2.setTitle("Student grades!");
//            stage2.setScene(scene2);
//            stage2.setResizable(false);
//            stage2.show();
//        }
//    }
    @FXML
    void update(ActionEvent event) throws IOException {
        boolean condition = MyJDBC.updateGrade(grade1.getText(),grade2.getText(),grade3.getText(),grade4.getText()
                ,grade5.getText(),grade6.getText(),GPA(),id.getText());
        if(condition)
        {
            grades.getScene().getWindow().hide();

            Stage stage2 = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("grades.fxml"));
            Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
            stage2.setTitle("Student grades!");
            stage2.setScene(scene2);
            stage2.setResizable(false);
            stage2.show();

        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

package com.example.ff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.example.ff.Grades.mainGpa;
import static com.example.ff.Previous.*;


public class StudentController implements Initializable {

    @FXML
    private BorderPane studentPage;


    @FXML
    private VBox hideThis;

    @FXML
    private  TextField studentAcademicEmail;

    @FXML
    private  TextField studentAddress;

    @FXML
    private  TextField studentFirstName;

    @FXML
    private  TextField studentId;

    @FXML
    private  TextField studentLastName;

    @FXML
    private  TextField studentPhone;

    @FXML
    private  TextField studentLevel;

    @FXML
    private  TextField studentDept;

    @FXML
    private  TextField studentCourse1;

    @FXML
    private  TextField studentCourse2;

    @FXML
    private  TextField studentCourse3;

    @FXML
    private  TextField studentCourse4;

    @FXML
    private  TextField studentCourse5;

    @FXML
    private  TextField studentCourse6;


    @FXML
    private Button previousButton;

    @FXML
    private Label previousLabel;

    @FXML
    private ImageView previousPic;


    @FXML
    private  Button back;
    @FXML
    private  Button submit;



    @FXML
    void previousButton(ActionEvent event) throws IOException {

        studentPage.getScene().getWindow().hide();
        Stage stage2 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("previous.fxml"));
        Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
        stage2.setTitle("Previous courses!");
        stage2.setScene(scene2);
        stage2.setResizable(false);
        stage2.show();


    }

    @FXML
    void submit(ActionEvent event) throws IOException {
        if(pc1==null || pc2==null || pc3==null|| pc4==null|| pc5==null|| pc6==null )
        {
            JOptionPane.showMessageDialog(null,"You must enter grades of previous courses at first",
                    "Invalid operation",2);
        }
        else {
            int grade1 = Integer.parseInt(pc1);
            int grade2 = Integer.parseInt(pc2);
            int grade3 = Integer.parseInt(pc3);
            int grade4 = Integer.parseInt(pc4);
            int grade5 = Integer.parseInt(pc5);
            int grade6 = Integer.parseInt(pc6);

            if (grade1 < 50) {
                JOptionPane.showMessageDialog(null, "You can't register for course 1, your degrees are below",
                        "Invalid operation", 2);
            }
            if (grade2 < 50) {
                JOptionPane.showMessageDialog(null, "You can't register for course 2, your degrees are below",
                        "Invalid operation", 2);
            }
            if (grade3 < 50) {
                JOptionPane.showMessageDialog(null, "You can't register for course 3, your degrees are below",
                        "Invalid operation", 2);
            }
            if (grade4 < 50) {
                JOptionPane.showMessageDialog(null, "You can't register for course 4, your degrees are below",
                        "Invalid operation", 2);
            }
            if (grade5 < 50) {
                JOptionPane.showMessageDialog(null, "You can't register for course 5, your degrees are below",
                        "Invalid operation", 2);
            }
            if (grade6 < 50) {
                JOptionPane.showMessageDialog(null, "You can't register for course 6, your degrees are below",
                        "Invalid operation", 2);
            } else {

                if (studentFirstName.getText().isEmpty() || studentLastName.getText().isEmpty() || studentAddress.getText().isEmpty() ||
                        studentPhone.getText().isEmpty() || studentAcademicEmail.getText().isEmpty() ||
                        studentLevel.getText().isEmpty() || studentDept.getText().isEmpty() ||
                        studentId.getText().isEmpty() || studentCourse1.getText().isEmpty() ||
                        studentCourse2.getText().isEmpty() || studentCourse3.getText().isEmpty() ||
                        studentCourse4.getText().isEmpty() || studentCourse5.getText().isEmpty() ||
                        studentCourse6.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(null, "All fields are required, please refill missing",
                            "Invalid operation!", 2);
                } else {
                    MyJDBC.getConnection();
                    boolean condition = MyJDBC.insertStudent(studentId.getText(), studentFirstName.getText(), studentLastName.getText(), studentAddress.getText()
                            , studentPhone.getText(), studentAcademicEmail.getText(), studentLevel.getText(), studentCourse1.getText(), studentCourse2.getText()
                            , studentCourse3.getText(), studentCourse4.getText(), studentCourse5.getText(), studentCourse6.getText(), mainGpa, studentDept.getText());
                    if (condition) {
                        JOptionPane.showMessageDialog(null, "Student main info has been successfully inserted"
                                , "Success", 1);

                        studentPage.getScene().getWindow().hide();
                        Stage stage2 = new Stage();
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student.fxml"));
                        Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
                        stage2.setTitle("Courses!");
                        stage2.setScene(scene2);
                        stage2.setResizable(false);
                        stage2.show();

                    } else {
                        JOptionPane.showMessageDialog(null, "Something went wrong!"
                                , "Invalid operation", 2);
                    }
                }
            }
        }

        }


    @FXML
    void update(ActionEvent event) throws IOException {
        boolean condition = MyJDBC.updateStudent(studentFirstName.getText(), studentLastName.getText(), studentAddress.getText(), studentPhone.getText()
                , studentAcademicEmail.getText(), studentLevel.getText(), studentCourse1.getText(), studentCourse2.getText(), studentCourse3.getText()
                , studentCourse4.getText(), studentCourse5.getText(), studentCourse6.getText(), studentDept.getText(), studentId.getText());

        if (condition) {
            studentPage.getScene().getWindow().hide();
            Stage stage2 = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student.fxml"));
            Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
            stage2.setTitle("Courses!");
            stage2.setScene(scene2);
            stage2.setResizable(false);
            stage2.show();
        }
    }

    @FXML
    void backClick(ActionEvent event) throws IOException {

        studentPage.getScene().getWindow().hide();
        Stage stage2 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
        Scene scene2 = new Scene(fxmlLoader.load(), 800, 500);
        stage2.setTitle("Home!");
        stage2.setScene(scene2);
        stage2.setResizable(false);
        stage2.show();
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}

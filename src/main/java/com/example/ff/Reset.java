package com.example.ff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class Reset {

    @FXML
    private VBox courses;

    @FXML
    private TextField idForReset;

    @FXML
    void reset(ActionEvent event) throws IOException {

        if(MyJDBC.searchAdminID(idForReset.getText()))
        {
            String pass =
            JOptionPane.showInputDialog(null,"Enter your new password!","Reset",1);
            MyJDBC.getConnection();
            MyJDBC.updatePassword(idForReset.getText(),pass);

            courses.getScene().getWindow().hide();

            Stage stage2 = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
            Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
            stage2.setTitle("Sign in!");
            stage2.setScene(scene2);
            stage2.setResizable(false);
            stage2.show();

        }
        else
        {
            JOptionPane.showMessageDialog(null,"No such ID!","Invalid operation!",2);
        }
    }


    @FXML
    void back(ActionEvent event) throws IOException {

        courses.getScene().getWindow().hide();

        Stage stage2 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student.fxml"));
        Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
        stage2.setTitle("Student Management!");
        stage2.setScene(scene2);
        stage2.setResizable(false);
        stage2.show();

    }

    @FXML
    void submit(ActionEvent event) throws IOException {
//        MyJDBC.getConnection();
//        boolean condition = MyJDBC.update(course1.getText(),course2.getText(),course3.getText(),
//                course4.getText(),course5.getText(),course6.getText(),globalId);
//
//        if(condition)
//        {
//            JOptionPane.showMessageDialog(null,"Courses have been added successfully to student"
//                    ,"Success!",1);
//
//            courses.getScene().getWindow().hide();
//
//            Stage stage2 = new Stage();
//            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
//            Scene scene2 = new Scene(fxmlLoader.load(), 800, 500);
//            stage2.setTitle("Home!");
//            stage2.setScene(scene2);
//            stage2.setResizable(false);
//            stage2.show();
//
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null,"Courses have not been added, check in again!"
//                    ,"Invalid operation!",2);
//        }

    }
}

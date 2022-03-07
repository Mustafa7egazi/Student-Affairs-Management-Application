package com.example.ff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController  implements Initializable {
    @FXML
    private TextField username;

    @FXML
    private TextField id;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField confirmPass;

    @FXML
    private VBox signup;

    @FXML
    void register(ActionEvent event) throws IOException {
        MyJDBC.getConnection();
          if(MyJDBC.insertAdmin(id.getText(),username.getText(),password.getText()) )
        {
            signup.getScene().getWindow().hide();

            Stage stage2 = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
            Scene scene2 = new Scene(fxmlLoader.load(), 800, 500);
            stage2.setTitle("Home!");
            stage2.setScene(scene2);
            stage2.setResizable(false);
            stage2.show();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Id is already exist","Invalid operation",2);
        }

    }



    @FXML
    void signinAction(ActionEvent event) throws IOException {
        signup.getScene().getWindow().hide();

        Stage stage2 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
        stage2.setTitle("Sign up!");
        stage2.setScene(scene2);
        stage2.setResizable(false);
        stage2.show();

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

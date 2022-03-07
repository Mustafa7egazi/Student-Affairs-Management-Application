package com.example.ff;
import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ResourceBundle;



public class LoginController implements Initializable {
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private TextField id;
    
    @FXML
    private VBox login;


    @FXML
    private Button sign;



    @FXML
    void forgotPress(ActionEvent event) throws IOException {
        login.getScene().getWindow().hide();

        Stage stage2 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("reset.fxml"));
        Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
        stage2.setTitle("Reset password!");
        stage2.setScene(scene2);
        stage2.setResizable(false);
        stage2.show();

    }

    @FXML
    void loginAction(ActionEvent event) throws IOException {

          MyJDBC.getConnection();
        if(id.getText().isEmpty() || username.getText().isEmpty()||password.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter info first, try again or sign up."
                    ,"Invalid operation",2);
        }
            else if(MyJDBC.searchAdmin(id.getText(),username.getText(),password.getText())) {
             login.getScene().getWindow().hide();
             Stage stage2 = new Stage();
             FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
             Scene scene2 = new Scene(fxmlLoader.load(), 800, 500);
             stage2.setTitle("Home!");
             stage2.setScene(scene2);
             stage2.setResizable(false);
             stage2.show();
         }
         else
             JOptionPane.showMessageDialog(null,"No such user, try again or sign up."
                     ,"Invalid operation",2);
    }

    @FXML
    void signupAction(ActionEvent event) throws IOException {

        login.getScene().getWindow().hide();

        Stage stage2 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("register.fxml"));
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
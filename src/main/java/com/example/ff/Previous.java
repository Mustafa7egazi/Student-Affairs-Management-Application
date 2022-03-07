package com.example.ff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Previous implements Initializable {

    @FXML
    private TextField prev1;

    @FXML
    private TextField prev2;

    @FXML
    private TextField prev3;

    @FXML
    private TextField prev4;

    @FXML
    private TextField prev5;

    @FXML
    private TextField prev6;

    @FXML
    private AnchorPane perviousPage;

    public static String pc1, pc2, pc3, pc4, pc5, pc6;


    @FXML
    void InsertClick(ActionEvent event) throws IOException {

        pc1 = prev1.getText();
        pc2 = prev2.getText();
        pc3 = prev3.getText();
        pc4 = prev4.getText();
        pc5 = prev5.getText();
        pc6 = prev6.getText();
        if (pc1.isEmpty() || pc2.isEmpty() || pc3.isEmpty() || pc4.isEmpty() || pc5.isEmpty() || pc6.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!", "Invalid operation", 2);
        } else {
            perviousPage.getScene().getWindow().hide();
            Stage stage2 = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student.fxml"));
            Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
            stage2.setTitle("Student management!");
            stage2.setScene(scene2);
            stage2.setResizable(false);
            stage2.show();

        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}

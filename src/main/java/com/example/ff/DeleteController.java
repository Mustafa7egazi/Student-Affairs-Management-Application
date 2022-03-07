package com.example.ff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteController {

        @FXML
        private VBox delete;

    @FXML
    private TextField id;


    @FXML
    void deleteClick(ActionEvent event) throws IOException {
        boolean condition = MyJDBC.delete(id.getText());
        if (condition) {
            delete.getScene().getWindow().hide();

            Stage stage2 = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("delete.fxml"));
            Scene scene2 = new Scene(fxmlLoader.load(), 900, 600);
            stage2.setTitle("Delete !");
            stage2.setScene(scene2);
            stage2.setResizable(false);
            stage2.show();

        }
    }

        @FXML
        void backClick(ActionEvent event) throws IOException {
            delete.getScene().getWindow().hide();

            Stage stage2 = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
            Scene scene2 = new Scene(fxmlLoader.load(), 800, 500);
            stage2.setTitle("Home !");
            stage2.setScene(scene2);
            stage2.setResizable(false);
            stage2.show();

        }

}

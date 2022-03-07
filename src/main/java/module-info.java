module com.example.ff {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.ff to javafx.fxml;
    exports com.example.ff;
}
module com.example.salmonttapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.salmonttapp to javafx.fxml;
    exports com.example.salmonttapp;
}
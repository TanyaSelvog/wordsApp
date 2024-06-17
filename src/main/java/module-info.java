module com.example.wordsapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wordsapp to javafx.fxml;
    exports com.example.wordsapp;
}
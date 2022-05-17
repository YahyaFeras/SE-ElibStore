module com.example.seelibstore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seelibstore to javafx.fxml;
    exports com.example.seelibstore;
}
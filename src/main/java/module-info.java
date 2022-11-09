module com.example.qalab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.qalab to javafx.fxml;
    exports com.example.qalab;
}
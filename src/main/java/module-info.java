module com.mazebank.mazebank {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mazebank.mazebank to javafx.fxml;
    exports com.mazebank.mazebank;
}
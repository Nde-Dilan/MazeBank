module com.mazebank.mazebank {
    requires javafx.controls;
    requires javafx.fxml;

    requires  de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    /* The opens keyword is used to allow specific packages within the module to be accessible
    *at runtime by frameworks that use reflection, s
    * uch as JavaFX, which needs to access the c
    * lasses at runtime to control the user interface.*/
    opens com.mazebank.mazebank to javafx.fxml;
    exports com.mazebank.mazebank;
    exports com.mazebank.mazebank.Controllers;
    exports com.mazebank.mazebank.Controllers.Admin;
    exports com.mazebank.mazebank.Controllers.Client;
    exports com.mazebank.mazebank.Models;
    exports com.mazebank.mazebank.Views;

}
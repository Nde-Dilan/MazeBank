module com.mazebank.mazebank {
    requires javafx.controls;
    requires javafx.fxml;

    requires  de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    //What's the use of this file? and what is this requires and exports? this file is used to specify the module's dependencies and other module-level information. and requires is used to specify the module's dependencies and exports is used to specify the packages that are accessible to other modules.
//This file is used in the Java module system to specify the module's dependencies and other module-level information.

    opens com.mazebank.mazebank to javafx.fxml;
    exports com.mazebank.mazebank;
    exports com.mazebank.mazebank.Controllers;
    exports com.mazebank.mazebank.Controllers.Admin;
    exports com.mazebank.mazebank.Controllers.Client;
    exports com.mazebank.mazebank.Models;
    exports com.mazebank.mazebank.Views;
}
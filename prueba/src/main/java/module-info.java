module com.pooespol.prueba {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pooespol.prueba to javafx.fxml;
    exports com.pooespol.prueba;
}
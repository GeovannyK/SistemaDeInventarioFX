module sistemadeinventario {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;

    opens sistemadeinventario to javafx.fxml;
    exports sistemadeinventario;
}

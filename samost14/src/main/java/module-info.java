module com.example.samost13 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.samost13 to javafx.fxml;
    exports com.example.samost13;
}
module com.example.samost12 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.samost12 to javafx.fxml;
    exports com.example.samost12;
}
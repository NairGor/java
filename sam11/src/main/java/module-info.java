module com.example.sam11 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.sam11 to javafx.fxml;
    exports com.example.sam11;
}
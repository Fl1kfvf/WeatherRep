module com.example.weatherReport {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.google.gson;
    requires java.net.http;
    requires org.slf4j;

    opens weatherReport to javafx.fxml;
    exports weatherReport;
    exports weatherReport.uiControllers;
    opens weatherReport.uiControllers to javafx.fxml;
    opens weatherReport.transport.data to com.google.gson;
    opens weatherReport.transport.data.util to com.google.gson;
}
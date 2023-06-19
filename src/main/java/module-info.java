module com.trafficligthsys {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.trafficligthsys to javafx.fxml;
    exports com.trafficligthsys;
}

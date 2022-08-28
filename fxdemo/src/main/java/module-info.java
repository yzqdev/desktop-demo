module com.example.fxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens net.yzq.fxdemo to javafx.fxml;
    exports net.yzq.fxdemo;
}
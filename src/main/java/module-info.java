module com.senai.javafx.javafxaula01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senai.javafx.javafxaula01 to javafx.fxml;
    exports com.senai.javafx.javafxaula01;
}
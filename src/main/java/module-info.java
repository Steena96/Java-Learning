module com.example.jdbc_sql {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.jdbc_sql to javafx.fxml;
    exports com.example.jdbc_sql;
}
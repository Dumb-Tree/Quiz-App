module com.tree.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires java.sql;
    
    opens com.tree.quizapp to javafx.fxml;
    exports com.tree.quizapp;
}

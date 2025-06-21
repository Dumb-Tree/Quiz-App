package com.tree.quizapp;

import com.tree.utils.MyAlert;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent action) throws IOException{    
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("QuestionManagement.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showMsg("coming soon...");
    }
}

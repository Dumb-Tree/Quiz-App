/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tree.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlert {
    private static MyAlert instance;

    public static Object getinstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final Alert alert;
    
    private MyAlert(){
                this.alert = new Alert(Alert.AlertType.CONFIRMATION);
        this.alert.setTitle("QuizApp");
        this.alert.setHeaderText("Quiz App");
    }
    public static MyAlert getInstance(){
        if (instance == null)
            instance = new MyAlert();
        return instance;
    }
    public void showMsg(String msg){
        this.alert.setContentText(msg);
        this.alert.showAndWait();
    }
}

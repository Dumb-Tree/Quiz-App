/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.tree.quizapp;

import com.tree.pojo.Category;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionManagementController implements Initialize {
    @FXML private ComboBox<Category> cbCates;
    public void initialize(URL url, ResourceBundle rb){
                    System.out.println("say gex");
        try{
            //B1 nạp driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //B2 Mở kết nối
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "root");
            //B3: Xử lý truy vấn
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Category");
            List<Category> cates = new ArrayList<>();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("Name");
                Category c= new Category(id,name);
                cates.add(c);
            }
            //B4 Đóng kết nối
            conn.close();
            this.cbCates.setItems(FXCollections.observableArrayList(cates));
        } catch (ClassNotFoundException | SQLException ex) {

        }
    }
    
}

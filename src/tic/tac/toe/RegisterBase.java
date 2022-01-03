/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class RegisterBase extends BorderPane {
    
    User client = new User();
    FXMLDocumentController controller = new FXMLDocumentController();
    
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final Text text;
    protected final TextField usernamereg;
    protected final PasswordField passwordreg;
    protected final Text text0;
    protected final Text text1;
    protected final Text validUsernameAndPass;
    protected final Text usernameUsed;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final Button registerBtn;
    protected final Button backToLogin;
        
    public RegisterBase(Stage mystage) {
        
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        text = new Text();
        usernamereg = new TextField();
        passwordreg = new PasswordField();
        text0 = new Text();
        text1 = new Text();
        validUsernameAndPass = new Text();
        usernameUsed = new Text();
        gridPane0 = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        registerBtn = new Button();
        backToLogin = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setPrefHeight(271.0);
        gridPane.setPrefWidth(599.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(343.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(343.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(193.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(56.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        text.setId("registertext");
        text.setStroke(javafx.scene.paint.Color.valueOf("#171717"));
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Register");
        text.setWrappingWidth(115.443359375);
        text.setFont(new Font("System Bold", 20.0));
        GridPane.setMargin(text, new Insets(0.0, 0.0, -40.0, 250.0));

        GridPane.setColumnIndex(usernamereg, 1);
        GridPane.setRowIndex(usernamereg, 1);
        usernamereg.setId("usernamefildreg");
        usernamereg.setPrefHeight(34.0);
        usernamereg.setPrefWidth(221.0);
        usernamereg.setPromptText("Enter your name");
        usernamereg.setFont(new Font(14.0));
        GridPane.setMargin(usernamereg, new Insets(70.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(passwordreg, 1);
        GridPane.setRowIndex(passwordreg, 2);
        passwordreg.setId("passwordfieldreg");
        passwordreg.setPrefHeight(39.0);
        passwordreg.setPrefWidth(366.0);
        passwordreg.setPromptText("Enter your password");
        passwordreg.setFont(new Font(15.0));
        GridPane.setMargin(passwordreg, new Insets(70.0, 0.0, 0.0, 0.0));

        GridPane.setRowIndex(text0, 1);
        text0.setId("usernametextreg");
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Username");
        text0.setFont(new Font(16.0));
        GridPane.setMargin(text0, new Insets(70.0, 0.0, 0.0, 60.0));

        GridPane.setRowIndex(text1, 2);
        text1.setId("passwordtextreg");
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Password");
        text1.setFont(new Font(16.0));
        GridPane.setMargin(text1, new Insets(70.0, 0.0, 0.0, 60.0));

        GridPane.setColumnIndex(validUsernameAndPass, 1);
        GridPane.setRowIndex(validUsernameAndPass, 3);
        validUsernameAndPass.setFill(javafx.scene.paint.Color.valueOf("#171717"));
        validUsernameAndPass.setId("validusernameandpass");
        validUsernameAndPass.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        validUsernameAndPass.setStrokeWidth(0.0);
        validUsernameAndPass.setText("Please enter valid username and password!");
        validUsernameAndPass.setVisible(false);
        GridPane.setMargin(validUsernameAndPass, new Insets(25.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(usernameUsed, 1);
        GridPane.setRowIndex(usernameUsed, 3);
        usernameUsed.setFill(javafx.scene.paint.Color.valueOf("#171717"));
        usernameUsed.setId("usernameuse");
        usernameUsed.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        usernameUsed.setStrokeWidth(0.0);
        usernameUsed.setText("This username already in use!");
        usernameUsed.setVisible(false);
        GridPane.setMargin(usernameUsed, new Insets(50.0, 0.0, 0.0, 65.0));
        setLeft(gridPane);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);
        gridPane0.setPrefHeight(132.0);
        gridPane0.setPrefWidth(600.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(585.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(556.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(291.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(44.0);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(registerBtn, 1);
        registerBtn.setId("registerbtn");
        registerBtn.setMnemonicParsing(false);
        registerBtn.setOnAction(this::gameModeAction);
        registerBtn.setPrefHeight(37.0);
        registerBtn.setPrefWidth(129.0);
        registerBtn.setText("Register");
        registerBtn.setFont(new Font("System Bold", 16.0));
        GridPane.setMargin(registerBtn, new Insets(-50.0, 0.0, 0.0, 230.0));

        GridPane.setRowIndex(backToLogin, 1);
        backToLogin.setId("backtologin");
        backToLogin.setMnemonicParsing(false);
        backToLogin.setOnAction(this::backToLoginAction);
        backToLogin.setPrefHeight(37.0);
        backToLogin.setPrefWidth(129.0);
        backToLogin.setText("Back to Login");
        GridPane.setMargin(backToLogin, new Insets(60.0, 30.0, 0.0, 230.0));
        backToLogin.setFont(new Font("System Bold", 16.0));
        setBottom(gridPane0);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getChildren().add(text);
        gridPane.getChildren().add(usernamereg);
        gridPane.getChildren().add(passwordreg);
        gridPane.getChildren().add(text0);
        gridPane.getChildren().add(text1);
        gridPane.getChildren().add(validUsernameAndPass);
        gridPane.getChildren().add(usernameUsed);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getColumnConstraints().add(columnConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        gridPane0.getRowConstraints().add(rowConstraints5);
        gridPane0.getChildren().add(registerBtn);
        gridPane0.getChildren().add(backToLogin);

    }

    protected void gameModeAction(javafx.event.ActionEvent actionEvent) {
        
        try {
            
            User clientExist = DAL.checkUserExits(usernamereg.getText());
            
            if(!usernamereg.getText().equals("") && passwordreg.getText().length() > 6){
                
                if(clientExist != null){
                    
                    System.out.println("This username already in use!");
                    validUsernameAndPass.setVisible(false);
                    usernameUsed.setVisible(true);
                    
                } else {
                    
                    controller.goToGameMode(actionEvent);
                    client.setUsername((usernamereg.getText()));
                    client.setPassword((passwordreg.getText())); //replace
                    client.setScore(0);
                    
                    System.out.println("INSERT INTO Client (USERNAME, PASSWORD, SCORES) VALUES ('"+ client.getUsername()+"','"+client.getPassword()+ "', 0)");
                    DAL.insertPlayer(client);
                }
                
            } else {
                
                System.out.println("Please enter a valid username and password");
                validUsernameAndPass.setVisible(true);
                usernameUsed.setVisible(false);
            }
            
        } 
       
        catch (IOException ex) {
            Logger.getLogger(LoginBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    protected void backToLoginAction(javafx.event.ActionEvent actionEvent) {
        
        try {
            controller.goToLogin(actionEvent);
        } catch (IOException ex) {
            Logger.getLogger(RegisterBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

}

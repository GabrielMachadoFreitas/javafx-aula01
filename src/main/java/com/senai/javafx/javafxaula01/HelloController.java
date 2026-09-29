package com.senai.javafx.javafxaula01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextArea digiteAqui;
    @FXML
    private Label nomeDaPessoa;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public void cadastrarPessoa(){
        String nome = digiteAqui.getText();
        nomeDaPessoa.setText("Olá: " + nome);
    }
}

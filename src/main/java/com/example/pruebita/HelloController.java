package com.example.pruebita;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.util.Arrays;
import java.util.List;

public class HelloController {
    @FXML
    private TextField campoCadenaInicial;

    @FXML
    private TextField campoCadenaFinal;

    @FXML
    private Button botonEjecutar;

    @FXML
    private Button botonLimpiar;

    @FXML
    private TextArea areaProcesos;

    @FXML
    private TextArea areaResultados;

    @FXML
    private Label welcomeText;

    //Método que se ejecutará cuando se presione el botón "Vaciar"
    @FXML
    protected void vaciarCampos() {
        System.out.println("Método vaciarCampos() llamado.");
        // Limpiar todos los campos de texto y áreas de texto
        List<Node> campos = Arrays.asList(campoCadenaInicial, campoCadenaFinal, areaProcesos, areaResultados);

        // Limpiar cada campo
        for (Node campo : campos) {
            if (campo instanceof TextField) {
                ((TextField) campo).setText(""); // Asigna texto vacío
            } else if (campo instanceof TextArea) {
                ((TextArea) campo).setText(""); // Asigna texto vacío
            }
        }
        botonLimpiar.setText("Borrado");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


/**
 *
 * @author Patrick Neris
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private TextField txt1;
    private TextField txt2;
    private TextField txtRes;
    private Button btnMulti;
    private Button btnDiv;
    private Button btnSoma;
    private Button btnSub;
    private Button btnLimpar;
    
    
    @FXML
    private void limpar(ActionEvent event) {
        txt1.setText("");
        txt2.setText("");
        txtRes.setText("");
    }
    
    private void multi (ActionEvent event){
        double n1 = (Double.parseDouble(txt1.getText()));
        double n2 = (Double.parseDouble(txt2.getText()));
        double res = n1*n2;
        txtRes.setText(Double.toString(res));
        
    }
    
    private void div (ActionEvent event){
        double n1 = (Double.parseDouble(txt1.getText()));
        double n2 = (Double.parseDouble(txt2.getText()));
        double res = n1/n2;
        txtRes.setText(Double.toString(res));
    }
    private void soma (ActionEvent event){
        double n1 = (Double.parseDouble(txt1.getText()));
        double n2 = (Double.parseDouble(txt2.getText()));
        double res = n1+n2;
        txtRes.setText(Double.toString(res));
    }
    
    private void sub (ActionEvent event){
        double n1 = (Double.parseDouble(txt1.getText()));
        double n2 = (Double.parseDouble(txt2.getText()));
        double res = n1-n2;
        txtRes.setText(Double.toString(res));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

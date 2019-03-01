package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.CuadradoMagico;
import model.CuadradosMagicos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Controller {
	
	 @FXML
	 private TextField txtFSize;

	 @FXML
	 private Button buttonOk;
	 
	 @FXML
	 private Label mensajeLabel;

	 @FXML
	 private ComboBox<Character> comboBoxStart;

	 @FXML
	 private ComboBox<String> comboBoxOrientation;

	 @FXML
	 private GridPane gridPaneMatrix;
	 
	 private CuadradosMagicos cuadro;
	 
	 ObservableList<Character> startList = FXCollections.observableArrayList(
			 CuadradosMagicos.A, CuadradosMagicos.B, CuadradosMagicos.C, CuadradosMagicos.D);
	 ObservableList<String> orientationList = FXCollections.observableArrayList(
			 CuadradosMagicos.NE, CuadradosMagicos.SE, CuadradosMagicos.NO, CuadradosMagicos.SO);
	 
	 public void initialize() {
		 comboBoxStart.setItems(startList);
		 comboBoxOrientation.setItems(orientationList);
	 }
	 
	 @FXML
	 void okInformation(ActionEvent event) {
		 
		gridPaneMatrix.getChildren().setAll();
		mensajeLabel.setText("");
		
		//CuadradosMagicos(String size, char start, String orientation)
		cuadro = new CuadradosMagicos(txtFSize.getText(), comboBoxStart.getText(), comboBoxOrientation.getText() )
		
		gridPaneMatrix.setAlignment(Pos.CENTER);
		gridPaneMatrix.setHgap(5);
		gridPaneMatrix.setVgap(5);
		
		
	 }

	   /* @FXML
	    void startAcition(ActionEvent event) {
	    	if(comboBoxStart.getValue() == CuadradosMagicos.A) {
	    	comboBoxOrientation.setItems(FXCollections.observableArrayList(CuadradosMagicos.NO, CuadradosMagicos.NE));
	    	}else if(comboBoxStart.getValue() == CuadradosMagicos.B) {
		    	comboBoxOrientation.setItems(FXCollections.observableArrayList(CuadradosMagicos.NO, CuadradosMagicos.SO));
		    }else if(comboBoxStart.getValue() == CuadradosMagicos.C) {
		    	comboBoxOrientation.setItems(FXCollections.observableArrayList(CuadradosMagicos.NO, CuadradosMagicos.NE));
		    }else {
		    	comboBoxOrientation.setItems(FXCollections.observableArrayList(CuadradosMagicos.SE, CuadradosMagicos.SO));
		    }
	    }*/

}

package controller;

import Exceptions.IncorrectInformation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import model.CuadradoMagico;

public class Controller {
	
	@FXML
    private ImageView imageSize;

    @FXML
    private ImageView imageStart;

    @FXML
    private ImageView imageOrient;

    @FXML
    private TextField txtFSize;

    @FXML
    private TextField txtFStart;

    @FXML
    private TextField txtFOrientation;

    @FXML
    private Button buttonOk;
    
    @FXML
    private Label mensajeLabel;

    @FXML
    private GridPane gridPaneMatrix;
    
    private CuadradoMagico cuadro;

    @FXML
    void okInformation(ActionEvent event) throws IncorrectInformation {
    	
    	gridPaneMatrix.getChildren().setAll();
    	mensajeLabel.setText("");
    	
    	cuadro = new CuadradoMagico(txtFSize.getText(), txtFStart.getText(), txtFOrientation.getText() );	
    	
    if(cuadro.getRight()) {
    	
    	int[][] sln = cuadro.cuadrado();
        	    	
        for(int i = 0; i < sln.length ; i++) {
        	for(int j = 0; j < sln.length; j++) {

        		gridPaneMatrix.getColumnConstraints().add(new ColumnConstraints(30));
        	    Label label = new Label(sln[i][j]+"");
        	    GridPane.setConstraints(label, j+1, i+1);
        	  	gridPaneMatrix.getChildren().addAll(label);
        	    			
        	 }
        }
            	
    	}else {
    		mensajeLabel.setText("Revise sus Entradas");
    	}
    	
    	gridPaneMatrix.setAlignment(Pos.CENTER);
    	gridPaneMatrix.setHgap(5);
    	gridPaneMatrix.setVgap(5);
    	
    	}
    	
    }
    

package userInterface;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ventana.fxml"));
		
		GridPane gridPaneMatrix = new GridPane();
		gridPaneMatrix = new GridPane();
    	gridPaneMatrix.setAlignment(Pos.CENTER);
    	gridPaneMatrix.setHgap(5);
    	gridPaneMatrix.setVgap(5);
    	gridPaneMatrix.add(new Label("12354"), 0, 0);
    	
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("CuadradoMagico");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

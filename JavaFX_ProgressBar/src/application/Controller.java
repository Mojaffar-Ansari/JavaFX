package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable{
	
	@FXML
	private ProgressBar myProgressBar;
	
	@FXML
	private Label myLabel;
	
	@FXML
	private Button myButton;
	
	double progress;
	
	public void increaseProgress() {
		if(progress < 0.99){
            progress += 0.1;
            myProgressBar.setProgress(progress);
            myLabel.setText(Math.round(progress * 100) + "%");
        }
	}
	


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		myProgressBar.setStyle("-fx-accent: #00FF00");
		
	}
	
}

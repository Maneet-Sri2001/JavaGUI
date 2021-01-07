package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label label;
	
	public void generateRandom(ActionEvent event) {
		Random randnum = new Random();
		int rand = randnum.nextInt(6)+1;
		//System.out.println(Integer.toString(rand));
		label.setText(Integer.toString(rand));
	}
}
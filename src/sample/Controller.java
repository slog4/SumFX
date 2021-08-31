package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {
	@FXML
	TextArea idFirstNamber;
	@FXML
	TextArea idSecondNamber;
	@FXML
	Label idResalt;

	public void onClickBatton(ActionEvent actionEvent) {
		int firstNamber=0;
		int secondNamber = 0;
		try {
			firstNamber = Integer.parseInt(idFirstNamber.getText());
			secondNamber = Integer.parseInt(idSecondNamber.getText());
			idResalt.setText(String.valueOf(firstNamber + secondNamber));
		}
		catch(Exception e){
			
		}
	}
}

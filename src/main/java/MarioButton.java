import javafx.scene.control.Button;

/**
 * Created by Clément on 04/01/2017.
 */
public class MarioButton extends Button implements IButton{
	public Button createButton() {
		Button but = new Button("Mario");
		but.setStyle("-fx-base: #d5383b;");
		but.setLayoutX(200);
		but.setLayoutY(50);
		return but;
	}
}

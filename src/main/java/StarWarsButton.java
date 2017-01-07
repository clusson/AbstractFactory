import javafx.scene.control.Button;

/**
 * Created by Clément on 04/01/2017.
 */
public class StarWarsButton extends Button implements IButton {
	public Button createButton() {
		Button but =  new Button("Star Wars");
		but.setStyle("-fx-base: #020005;");
		but.setLayoutX(200);
		but.setLayoutY(50);
		return but;
	}
}

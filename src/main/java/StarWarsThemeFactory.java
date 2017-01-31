import javafx.scene.control.Button;

/**
 * Created by Clément on 04/01/2017.
 */
public class StarWarsThemeFactory implements IThemeFactory {

	public Button getButton() {
        return new changeSizeDecorator(new StarWarsButton()).createButton();
	}
}

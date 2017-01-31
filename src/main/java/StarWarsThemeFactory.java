import javafx.scene.control.Button;

public class StarWarsThemeFactory implements IThemeFactory {

	public Button getButton() {
        return new changeSizeDecorator(new StarWarsButton()).createButton();
	}
}

import javafx.scene.control.Button;

/**
 * Created by Clément on 04/01/2017.
 */
public class StarWarsThemeFactory implements IThemeFactory {

	public Button getButton() {
        return new changeOpacityDecorator(new TextUpperCaseDecorator(new StarWarsButton())).createButton();
	}

	public String getName() {
		return "Star Wars";
	}
}

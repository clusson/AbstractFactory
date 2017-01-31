import javafx.scene.control.Button;

/**
 * Created by Clément on 04/01/2017.
 */
public class MarioThemeFactory extends Button implements IThemeFactory{

	public Button getButton() {
        return new changeOpacityDecorator(new TextUpperCaseDecorator(new MarioButton())).createButton();

    }

	public String getName() {
		return "Mario";
	}



}

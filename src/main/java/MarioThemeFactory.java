import javafx.scene.control.Button;

public class MarioThemeFactory extends Button implements IThemeFactory{

	public Button getButton() {
        return new changeOpacityDecorator(new TextUpperCaseDecorator(new MarioButton())).createButton();

    }


}

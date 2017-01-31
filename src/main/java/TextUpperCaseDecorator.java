import javafx.scene.control.Button;

/**
 * Created by Clement on 30/01/2017.
 */
public class TextUpperCaseDecorator implements IButton {

    private IButton _but;

    public TextUpperCaseDecorator(IButton button){
        this._but=button;
    }

    @Override
    public Button createButton() {
        Button but = this._but.createButton();
        but.setText(but.getText().toUpperCase());
        return but;
    }
}

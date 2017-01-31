import javafx.scene.control.Button;

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

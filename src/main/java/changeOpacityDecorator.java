import javafx.scene.control.Button;

public class changeOpacityDecorator implements IButton {

    private IButton _but;

    public changeOpacityDecorator(IButton button){
        this._but=button;
    }

    @Override
    public Button createButton() {
        Button but = this._but.createButton();
        but.setOpacity(0.3);
        return but;
    }
}

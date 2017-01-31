import javafx.scene.control.Button;

/**
 * Created by Clement on 31/01/2017.
 */
public class changeSizeDecorator implements IButton{
    private IButton _but;

    public changeSizeDecorator(IButton button){
        this._but=button;
    }

    @Override
    public Button createButton() {
        Button but = this._but.createButton();
        but.setPrefSize(170.0,40.0);
        return but;
    }
}

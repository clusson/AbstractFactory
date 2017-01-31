import javafx.scene.control.Button;

import java.awt.event.MouseEvent;

/**
 * Created by Clement on 31/01/2017.
 */
public class HideOnClickDecorator implements IButton{
    private IButton _but;

    public HideOnClickDecorator(IButton button){
        this._but=button;
    }

    @Override
    public Button createButton() {
        Button but = this._but.createButton();
        if (MouseEvent.MOUSE_ENTERED == 4)
            {
                but.setVisible(false);
            }
        return but;
    }
}

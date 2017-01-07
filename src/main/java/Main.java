import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class Main extends Application {

	public Button button;
	public static void main(String[] args) {
		Application.launch(Main.class, args);
	}

	@Override
	public void start(final Stage stage) {
		final Group root = new Group();
		Scene scene = new Scene(root, 600, 250);

		ObservableList<Themes> themes =
				FXCollections.observableArrayList(
						Themes.StarWars,
						Themes.Mario
				);
		button = new MarioThemeFactory().getButton();

		final ComboBox comboBox = new ComboBox(themes);
		comboBox.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				root.getChildren().remove(button);
				if(comboBox.getValue() == Themes.Mario){
					button = new MarioThemeFactory().getButton();
				} else {
					button = new StarWarsThemeFactory().getButton();
				}
				root.getChildren().add(button);
			}
		});


		comboBox.setLayoutX(200);
		comboBox.setLayoutY(100);

		root.getChildren().add(button);
		root.getChildren().add(comboBox);
		stage.setTitle("Abstract Factory");
		stage.setScene(scene);
		stage.show();
	}
}
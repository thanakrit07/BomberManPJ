import draw.GameScreen;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.GamePlayer;
import sharedObject.RenderableHolder;

public class Main extends Application {
	public void start(Stage primaryStage) {
		Group root = new Group();

		GameScreen gamescreen = new GameScreen(1080, 920);
		GamePlayer gameplayer = new GamePlayer();

		Scene scene = new Scene(root);
		root.getChildren().add(gamescreen);
		gamescreen.requestFocus();

		primaryStage.setScene(scene);
		primaryStage.setTitle("Bomberman");
		primaryStage.show();

		AnimationTimer animation = new AnimationTimer() {
			public void handle(long now) {

				gamescreen.paintComponent();
				gameplayer.update();
				RenderableHolder.getInstance().update();
			}
		};
		animation.start();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

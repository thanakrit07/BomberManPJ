import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.Map;

public class Main extends Application{
	public void start(Stage primaryStage) {
		Group root = new Group();
		Map map =new Map();
		Scene scene =new Scene(root);
		root.getChildren().add(map);
		map.requestFocus();
		
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Bomberman");
		primaryStage.show();
		
		AnimationTimer animation = new AnimationTimer() {
			public void handle(long now) {
				map.MapUpdate();
			}
		};
		animation.start();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

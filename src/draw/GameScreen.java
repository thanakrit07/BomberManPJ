package draw;

import input.KeyInput;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import sharedObject.IRenderable;
import sharedObject.RenderableHolder;

public class GameScreen extends Canvas{

	
	public GameScreen(double width, double height) {
		super(width, height);
		this.setVisible(true);
//		gc.setFill(Color.AQUAMARINE);
//		gc.fillRect(0,0, 1080,920);
		addInput();
	}
	public void addInput() {
		this.setOnKeyPressed((KeyEvent event)-> {
			KeyInput.setKeyPressed(event.getCode(), true);

		});
		this.setOnKeyReleased((KeyEvent event) -> {
			KeyInput.setKeyPressed(event.getCode(), false);
		});


	}
	
	public void paintComponent() {
		GraphicsContext gc = this.getGraphicsContext2D();
		gc.setFill(Color.AQUAMARINE);
		gc.fillRect(0,0,this.getWidth(),this.getHeight());
		for (IRenderable entity : RenderableHolder.getInstance().getEntities()) {
			// System.out.println(entity.getZ());
			if (entity.isVisible()) {
				entity.draw(gc);
			}
		}

		// System.out.println("===============");
		// System.out.println("===============");

	}
	
}

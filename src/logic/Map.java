package logic;

import input.KeyInput;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class Map extends Canvas{
	BomberMan p1 =new player1(10, 10);
	public static GraphicsContext gc;
	
	public Map() {
		super(1080,920);
		gc = this.getGraphicsContext2D();
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
	
	public void MapUpdate() {
		//GraphicsContext gc = this.getGraphicsContext2D();
		gc.setFill(Color.AQUAMARINE);
		gc.fillRect(0,0, 1080,920);		
		p1.draw(gc);
		p1.update();		

	}
	
	public static GraphicsContext getGC() {
		return gc;
	}
}


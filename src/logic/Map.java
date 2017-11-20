package logic;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Map extends Canvas{
	player1 p1 =new player1(10, 10);
	
	public Map() {
		super(1080,920);
		GraphicsContext gc = this.getGraphicsContext2D();
		gc.setFill(Color.AQUAMARINE);
		gc.fillRect(0,0, 1080,920);
		
	}
	
	public void MapUpdate() {
		p1.draw(this.getGraphicsContext2D());
		p1.update();		

	}
}


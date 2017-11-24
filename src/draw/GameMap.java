package draw;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import logic.Wall;
import logic.player1;
import logic.player2;
import sharedObject.IRenderable;

public class GameMap implements IRenderable{
	private player1 p1;
	private player2 p2;
	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		gc.setFill(Color.BURLYWOOD);
		gc.fillRect(0, 0, 1080, 920);
		Wall wall = new Wall(500,500);
		wall.draw(gc);
		

	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return -9999;
	}

}

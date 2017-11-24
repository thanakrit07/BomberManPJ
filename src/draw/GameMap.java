package draw;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import logic.Wall;
import logic.player1;
import logic.player2;
import sharedObject.IRenderable;

public class GameMap implements IRenderable{
	public Wall wall=new Wall(500,500);
	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		gc.setFill(Color.BURLYWOOD);
		gc.fillRect(0, 0, 1080, 920);
	
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

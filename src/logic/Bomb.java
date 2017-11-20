package logic;

import ShareObject.IRenderable;
import input.KeyInput;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class Bomb implements IRenderable{
	private double x,y;
	private boolean visible;
	public Bomb(double x,double y) {
		this.x=x;
		this.y=y;
		this.visible = false;
	}
	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		gc.setFill(Color.ANTIQUEWHITE);
		gc.fillRect(x, y, 25, 25);
	}
	
	public void setVisible(boolean visible) {
		this.visible=visible;
	}
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return this.visible;
	}
	
}

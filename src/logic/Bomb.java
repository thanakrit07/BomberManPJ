package logic;

import input.KeyInput;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import sharedObject.IRenderable;

public class Bomb extends Entity {
	private double x, y;

	private boolean visible;
	private int bombRange;

	public Bomb(double x, double y, int bombRange) {
		this.x = x;
		this.y = y;
		this.bombRange = bombRange;
		this.visible = false;
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		gc.setFill(Color.ANTIQUEWHITE);
		gc.fillRect(x, y, 60, 60);
	}

	public void drawEffectBomb(GraphicsContext gc) {
		gc.setFill(Color.AQUA);
		gc.fillRect(x + 60, y, 60 * bombRange, 60);
		gc.fillRect(x - (60 * bombRange), y, 60 * bombRange, 60);
		gc.fillRect(x, y - (60 * bombRange), 60, 60 * bombRange);
		gc.fillRect(x, y + 60, 60, 60 * bombRange);
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return this.visible;
	}

	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return -100;
	}

}

package logic;

import input.KeyInput;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class player1 extends BomberMan{
	
	public player1(double x, double y) {
		super(x,y);
		this.direction = 0;
		this.bombRange=1;
		this.speed=5;
		this.alive=true;
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (KeyInput.getKeyPressed(KeyCode.UP))Up();
		else if (KeyInput.getKeyPressed(KeyCode.DOWN))Down();
		else if (KeyInput.getKeyPressed(KeyCode.LEFT))Left();
		else if (KeyInput.getKeyPressed(KeyCode.RIGHT))Right();
	}
	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		gc.setFill(Color.BLUE);
		gc.fillOval(this.x, this.y, 60, 60);		
	}

	
}

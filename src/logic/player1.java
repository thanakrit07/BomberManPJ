package logic;
import logic.Bomb;
import input.KeyInput;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class player1 extends BomberMan{
	public player1(double x, double y) {
		super(x,y);
		this.direction = 1; // Right
		this.bombRange=1;
		
		this.speed=5;
		
		this.alive=true;		
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (KeyInput.getKeyPressed(KeyCode.W))Up();
		else if (KeyInput.getKeyPressed(KeyCode.S))Down();
		else if (KeyInput.getKeyPressed(KeyCode.A))Left();
		else if (KeyInput.getKeyPressed(KeyCode.D))Right();
		if(KeyInput.getKeyPressed(KeyCode.SPACE)) {
			if(!KeyInput.setkeyPressed.contains(KeyCode.SPACE)) {
				DropBomb();
				KeyInput.setkeyPressed.add(KeyCode.SPACE);
			}
		}
		
	}
	
	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		gc.setFill(Color.BLUE);
		gc.fillOval(x, y, 60, 60);
		for(Bomb i: this.bombList) {
			if(i.isVisible()) {
				i.drawEffectBomb(gc);
				i.draw(gc);
				
			}
		}
	}

	

	

}

package logic;

import logic.Bomb;
import input.KeyInput;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class player2 extends BomberMan {
	public player2(double x, double y) {
		super(x, y);
		this.direction = 1; // Right
		this.bombRange = 1;

		this.speed = 5;
	
		this.alive = true;

	}
	
	public Hitbox getHitbox() {
		return this.Ihitbox;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (KeyInput.getKeyPressed(KeyCode.UP)) {
			Up();
			this.direction =0;
		}			
		
		else if (KeyInput.getKeyPressed(KeyCode.DOWN)) {
			Down();
			this.direction =2;
		}
		
		else if (KeyInput.getKeyPressed(KeyCode.LEFT)) {
			Left();
			this.direction =3;
		}
			
		else if (KeyInput.getKeyPressed(KeyCode.RIGHT)) {
			Right();
			this.direction =1;			
		}

		if (KeyInput.getKeyPressed(KeyCode.ENTER)) {
			if (!KeyInput.setkeyPressed.contains(KeyCode.ENTER)) {
				DropBomb();
				KeyInput.setkeyPressed.add(KeyCode.ENTER);
			}
		}

	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		for (Bomb i : this.bombList) {
			if (i.isVisible()) {
				i.drawEffectBomb(gc);
				i.draw(gc);

			}
		}
		gc.setFill(Color.BLUE);
		gc.fillOval(x, y, 60, 60);
	}

	public int getZ() {
		return 0;
	}
}

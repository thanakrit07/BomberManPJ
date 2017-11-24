package logic;

import logic.Bomb;
import input.KeyInput;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class player1 extends BomberMan {
	public player1(double x, double y) {
		super(x, y);
		this.direction = 1; // Right
		this.bombRange = 1;

		this.speed = 5;
		this.hitBox = new Hitbox(x,y,60,60);
		this.alive = true;

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (KeyInput.getKeyPressed(KeyCode.W)) {
			Up();
			this.direction =0;
		}
		else if (KeyInput.getKeyPressed(KeyCode.S)) {
			Down();
			this.direction =2;
		}
		else if (KeyInput.getKeyPressed(KeyCode.A)) {
			Left();
			this.direction =3;
		}
		else if (KeyInput.getKeyPressed(KeyCode.D)) {
			Right();
			this.direction =1;
		}
		this.hitBox.x=this.x;
		this.hitBox.y=this.y;
		if (KeyInput.getKeyPressed(KeyCode.SPACE)) {
			if (!KeyInput.setkeyPressed.contains(KeyCode.SPACE)) {
				DropBomb();
				KeyInput.setkeyPressed.add(KeyCode.SPACE);
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

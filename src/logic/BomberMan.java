package logic;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import logic.Hitbox;

public abstract class BomberMan extends Entity {
	protected int speed;
	protected int bombRange;
	protected List<Bomb> bombList = new ArrayList<Bomb>();
	protected int direction;
	protected Hitbox Ihitbox, hitbox;

	protected boolean alive;

	protected BomberMan(double x, double y) {
		this.x = x;
		this.y = y;
		this.visible=true;
		this.alive = true;
		this.Ihitbox = new Hitbox(x, y, 60, 60);

	}

	protected void Up() {
		if (!IshitWall(hitbox)) {
			this.y -= speed;
			this.Ihitbox.y -= speed;
		}else {
			this.y += speed;
			this.Ihitbox.y += speed;
		}
	}

	protected void Down() {
		if (!IshitWall(hitbox)) {
			this.y += speed;
			this.Ihitbox.y += speed;
		}else {
			this.y -= speed;
			this.Ihitbox.y -= speed;
		}
	}

	protected void Left() {
		if (!IshitWall(hitbox)) {
			this.x -= speed;
			this.Ihitbox.x -= speed;
		}else {
			this.x += speed;
			this.Ihitbox.x += speed;
		}
		
	}

	protected void Right() {
		if (!IshitWall(hitbox)) {
			this.x += speed;
			this.Ihitbox.x += speed;
		}else {
			this.x -= speed;
			this.Ihitbox.x -= speed;
		}
	}

	protected void DropBomb() {
		Bomb bomb = new Bomb(this.x, this.y, this.bombRange);
		bomb.setVisible(true);
		this.bombList.add(bomb);
	}

	protected void EffectBomb(double x, double y) {

	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	protected boolean IshitWall(Hitbox wall) {
		return this.Ihitbox.IsHit(wall);

		// if (this.direction==0) {
		//
		// this.y=wall.y+wall.h+0.001;
		// this.hitBox.y=wall.y+wall.h+0.001;
		// }
		// else if(this.direction==1) {
		// this.x=wall.x-this.hitBox.w+0.001;
		// this.hitBox.x=wall.x-this.hitBox.w+0.001;
		// }
		// else if(this.direction==2) {
		// this.y=wall.y-this.hitBox.h+0.001;
		// this.hitBox.y=wall.y-this.hitBox.h+0.001;
		// }
		// else if(this.direction==3) {
		// this.x=wall.x+wall.w+0.0001;
		// this.hitBox.x=wall.x+wall.w+0.001;
		// }
	}

	public abstract void update();

	public abstract void draw(GraphicsContext gc);

}
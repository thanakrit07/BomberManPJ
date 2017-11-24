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
	protected Hitbox hitBox;

	protected boolean alive;

	protected BomberMan(double x, double y) {
		this.x = x;
		this.y = y;
		this.alive = true;
		this.hitBox = new Hitbox(x,y,60,60);

	}

	protected void Up() {
		this.y -= speed;
		this.hitBox.y-= speed;
	
	}

	protected void Down() {
		this.y += speed;
		this.hitBox.y+= speed;
	}

	protected void Left() {
		this.x -= speed;
		this.hitBox.x-= speed;
	}

	protected void Right() {
		this.x += speed;
		this.hitBox.x+= speed;
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
	
	public void hitWall() {
		System.out.println("hit");
		if (this.direction==0)this.y+=this.speed;
		else if(this.direction==1)this.x-=this.speed;
		else if(this.direction==2)this.y-=this.speed;
		else if(this.direction==3)this.x+=this.speed;
	}

	public abstract void update();

	public abstract void draw(GraphicsContext gc);

}
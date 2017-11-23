package logic;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class BomberMan extends Entity{
	protected static int speed;
	protected int bombRange;
	protected List<Bomb> bombList = new ArrayList<Bomb>();
	protected int direction;
	
	protected boolean alive;
	
	protected BomberMan(double x,double y) {
		this.x = x;
		this.y = y;
		alive = true;
	
	}
	
	protected void Up() {
		this.y-= speed;
		System.out.println("Up");
	}
	
	protected void Down() {
		this.y+= speed;
		System.out.println("Down");
	}

	protected void Left() {
		this.x-= speed;
	}

	protected void Right() {
		this.x+= speed;
	}
	protected void DropBomb() {
		Bomb bomb = new Bomb(this.x,this.y,this.bombRange);
		bomb.setVisible(true);
		this.bombList.add(bomb);
	}
	
	protected void EffectBomb(double x,double y) {
		  
	}


	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public abstract void update() ;
	
	public abstract void draw(GraphicsContext gc);
	
	
}
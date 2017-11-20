package logic;



import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class BomberMan extends Entity{
	protected static int speed;
	protected int bombRange;
	
	protected int direction;
	
	protected boolean alive;
	
	protected BomberMan(double x,double y) {
		this.x = x;
		this.y = y;
		alive = true;
	}
	
	protected void Up() {
		this.y-=BomberMan.speed;
	}
	
	protected void Down() {
		this.y+=BomberMan.speed;
	}

	protected void Left() {
		this.x-=BomberMan.speed;
	}

	protected void Right() {
		this.x+=BomberMan.speed;
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
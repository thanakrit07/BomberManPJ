package logic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Wall extends Entity{
	
	Hitbox hitbox;
	public Wall(double x,double y) {
		this.x=x;
		this.y=y;
		hitbox = new Hitbox(x,y,60,60);
	}
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		gc.setFill(Color.WHITE);
		gc.fillRect(this.x, this.y, 60, 60);
	}
	
}

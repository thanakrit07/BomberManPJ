package logic;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Hitbox extends Rectangle{
	protected double x,y,w,h;
	protected int speed;
	
	public Hitbox(double x,double y,double w,double h) {
		super(x,y,w,h);
	}
	
	 //IsPlayerhitbyEffectedBomb 
	public boolean IsHit(Rectangle block) {
		boolean ishit = false;
		Shape intersect = Shape.intersect(block, this);
		if(intersect.getBoundsInParent().getWidth() != -1) {
			ishit = true;
		}
//		if(Math.hypot(block.x-this.x, block.y-this.y) < block.w || Math.hypot(block.x-this.x, block.y-this.y) < block.h) {
//			ishit = true;
//		}
		return ishit;

	}
	//checked getBox
	
}

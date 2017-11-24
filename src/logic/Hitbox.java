package logic;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Hitbox extends Rectangle{
	protected double x,y,w,h;
	
	public Hitbox(double x,double y,double w,double h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	 //IsPlayerhitbyEffectedBomb 
	protected boolean IsHit(Rectangle other) {
		boolean hited = false;
		Shape intersect = Shape.intersect(other, this);
		if (intersect.getBoundsInLocal().getWidth() != -1) {
			hited = true;
		}
		return hited ;
	}
	//checked getBox
	
}

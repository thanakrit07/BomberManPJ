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
	public boolean IsHit(Rectangle other) {
		
		boolean hited = false;
		Shape intersect = Shape.intersect(this, other);
		System.out.println(intersect.getBoundsInLocal().getWidth());
		if (intersect.getBoundsInLocal().getWidth() != -1) {
			System.out.println("hit");
			hited = true;
		}
		return hited ;
	}
	//checked getBox
	
}

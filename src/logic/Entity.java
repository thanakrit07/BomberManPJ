package logic;

import sharedObject.IRenderable;

public abstract class Entity implements IRenderable {
	protected double x,y;
	protected int z;
	
	protected int direction = 0; // Right
	
	protected boolean visible;
	
	protected Entity() {
		this.visible=true;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public int getZ() {
		return z;
	}
}

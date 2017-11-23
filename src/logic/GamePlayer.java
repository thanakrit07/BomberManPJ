package logic;

import sharedObject.RenderableHolder;

public class GamePlayer {
	private player1 p1 ;
	private player2 p2 ;
	public GamePlayer () {
		p1=new player1(10,10);
		p2=new player2(1000,900);
		addNewObject(p1);
		addNewObject(p2);
	}
	public void update() {
		p1.update();
		p2.update();
	}
	
	protected void addNewObject(Entity entity){
		RenderableHolder.getInstance().add(entity);
	}
	
	public void gameplayerUpdate() {
		p1.update();
		p2.update();
	}
}

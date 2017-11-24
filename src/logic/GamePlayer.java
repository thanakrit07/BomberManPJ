package logic;

import draw.GameMap;
import sharedObject.RenderableHolder;

public class GamePlayer {
	private player1 p1;
	private player2 p2;
	GameMap gamemap = new GameMap();
	public GamePlayer() {
		
		RenderableHolder.getInstance().add(gamemap);
		p1 = new player1(10, 10);
		p2 = new player2(1010, 850);
		addNewObject(p1);
		addNewObject(p2);
		addNewObject(gamemap.wall);
	}

	public void update() {
		System.out.println("Xhitbox1: "+p1.hitBox.x);
		System.out.println("Xhitbox2: "+p2.hitBox.x);
		if(p1.getHitbox().IsHit(gamemap.wall.getHitbox())) {
			p1.hitWall();
		}
		if(p2.getHitbox().IsHit(gamemap.wall.getHitbox())) {
			p2.hitWall();
		}
		p1.update();
		p2.update();
	}

	protected void addNewObject(Entity entity) {
		RenderableHolder.getInstance().add(entity);
	}

}

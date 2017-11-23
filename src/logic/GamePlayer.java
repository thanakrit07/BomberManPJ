package logic;

import draw.GameMap;
import sharedObject.RenderableHolder;

public class GamePlayer {
	private player1 p1;
	private player2 p2;

	public GamePlayer() {
		GameMap gamemap = new GameMap();
		RenderableHolder.getInstance().add(gamemap);
		p1 = new player1(10, 10);
		p2 = new player2(1010, 850);
		addNewObject(p1);
		addNewObject(p2);
	}

	public void update() {
		p1.update();
		p2.update();
	}

	protected void addNewObject(Entity entity) {
		RenderableHolder.getInstance().add(entity);
	}

}

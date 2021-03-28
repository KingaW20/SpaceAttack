package spaceattack.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import spaceattack.game.controllers.PlayerController;
import spaceattack.meta.AxisSpeed;

import java.awt.*;

public class SpaceAttack extends ApplicationAdapter {
	ShapeRenderer shapeRenderer;
	PlayerObject player1, player2;
	PlayerController playerController;
	Point p1Position, p2Position;
	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
		player1 = new PlayerObject(shapeRenderer, 20, new Color(0,0,0));
		player2 = new PlayerObject(shapeRenderer, 20, new Color(255,255,255));
		p1Position = new Point(450,30);
		p2Position = new Point(200,30);
		playerController = new PlayerController();
	}

	@Override
	public void render () {
		playerController.keyListening(p1Position, new AxisSpeed(3,3));
		Gdx.gl.glClearColor(.25f, .25f, .25f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		player1.init(p1Position);
		player2.init(p2Position);
	}

	@Override
	public void dispose () {
		shapeRenderer.dispose();
	}
}
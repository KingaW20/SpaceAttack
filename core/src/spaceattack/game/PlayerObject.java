package spaceattack.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.awt.*;

public class PlayerObject {
    private ShapeRenderer renderer;
    private Point position;
    private float size;
    private Color color;

    public PlayerObject(ShapeRenderer renderer, float size, Color color)
    {
        this.renderer = renderer;
        this.size = size;
        this.color = color;
    }

    public void init(Point position) {
        this.position = position;
        renderer.begin(ShapeRenderer.ShapeType.Filled);
        renderer.setColor((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 1);
        renderer.circle(position.x, position.y, size);
        renderer.end();
    }
}

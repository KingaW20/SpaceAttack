package spaceattack.game.controllers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import spaceattack.meta.AxisSpeed;

import java.awt.*;

public class PlayerController {

    public void keyListening(Point position, AxisSpeed axisSpeed) {

        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            position.x-=axisSpeed.x;
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.D)){
            position.x+=axisSpeed.x;
        }
    }
}

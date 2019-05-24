package com.monvla.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CheesePlease extends Game {
	private SpriteBatch batch;

	private Texture mouseyTexture;
	private float mouseyX;
	private float mouseyY;

	private Texture cheeseTexture;
	private float cheeseX;
	private float cheeseY;

	private Texture floorTexture;
	private Texture winMessage;

	private boolean win;
	
	@Override
	public void create () {
		batch = new SpriteBatch();

		mouseyTexture = new Texture(
		        Gdx.files.internal("mouse.png"));
		mouseyX = 20;
		mouseyY = 20;

		cheeseTexture = new Texture(
		        Gdx.files.internal("cheese.png"));
        cheeseX = 400;
        cheeseY = 300;

        floorTexture = new Texture(Gdx.files.internal("tiles.jpg"));
        winMessage = new Texture(Gdx.files.internal("you-win.png"));

        win = false;
	}

	@Override
	public void render () {
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
		    mouseyX--;
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
		    mouseyX++;
		if (Gdx.input.isKeyPressed(Input.Keys.UP))
		    mouseyY++;
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN))
		    mouseyY--;

		if ((mouseyX > cheeseX)
            && (mouseyX + mouseyTexture.getWidth() < cheeseX + cheeseTexture.getWidth())
            && (mouseyY > cheeseY)
            && (mouseyY + mouseyTexture.getHeight() < cheeseY + cheeseTexture.getHeight()) )
		    win = true;

		Gdx.gl.glClearColor(0.8f, 0.8f, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw(floorTexture, 0, 0);
		batch.draw(cheeseTexture, cheeseX, cheeseY);
		batch.draw(mouseyTexture, mouseyX, mouseyY);
		if (win) batch.draw(winMessage, 170, 60);
		batch.end();
	}

}

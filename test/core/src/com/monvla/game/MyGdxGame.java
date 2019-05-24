package com.monvla.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.logging.FileHandler;

public class MyGdxGame extends Game {

    private Texture mTexture;
    private SpriteBatch mBatch;

	@Override
	public void create () {
		FileHandle worldFile = Gdx.files.internal("badlogic.jpg");

		mTexture = new Texture(worldFile);
		mBatch = new SpriteBatch();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        mBatch.begin();
        mBatch.draw(mTexture, 192, 112);
        mBatch.end();
	}

}

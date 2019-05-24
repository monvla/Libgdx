package com.monvla.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class BaseActor extends Actor {
    public TextureRegion mRegion;
    public Rectangle boundary;
    public float velocityX;
    public float velocityY;

    public BaseActor()
    {
        super();
        mRegion = new TextureRegion();
        boundary = new Rectangle();
        velocityX = 0;
        velocityY = 0;
    }

    public void setTexture(Texture t) {
        int w = t.getWidth();
        int h = t.getHeight();
        setWidth(w);
        setHeight(h);
        mRegion.setRegion(t);
    }

    public Rectangle getBoundingRectangle()
    {
        boundary.set(getX(), getY(), getWidth(), getHeight());
        return boundary;
    }

    public void act(float dt) {
        super.act(dt);
        moveBy(velocityX * dt, velocityY * dt);
    }

    public void draw(Batch batch, float parentAlpha)
    {
        Color c = getColor();
        batch.setColor(c.r, c.g, c.b, c.a);
        if (isVisible()){
            batch.draw(mRegion, getX(), getY(), getOriginX(), getOriginY(), getWidth(),
                    getHeight(),getScaleX(),getScaleY(), getRotation());
        }
    }

}

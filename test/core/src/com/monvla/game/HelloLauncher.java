package com.monvla.game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class HelloLauncher {
    public static void main (String[] args) {
        MyGdxGame myProgram = new MyGdxGame();
        LwjglApplication launcher = new LwjglApplication(myProgram);
        System.out.println("Epta");
    }
}

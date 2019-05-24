package com.monvla.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.monvla.game.CheesePlease;
import com.monvla.game.CheesePlease2;
import com.monvla.game.CheesePlease3;
import com.monvla.game.CheesePlease4;

public class DesktopLauncher {
	public static void main (String[] arg) {
		//LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//new LwjglApplication(new CheesePlease(), config);

		CheesePlease4 myProgram = new CheesePlease4();
		LwjglApplication launcher = new LwjglApplication(myProgram);
	}
}

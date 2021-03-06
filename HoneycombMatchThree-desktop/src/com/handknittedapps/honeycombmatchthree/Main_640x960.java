package com.handknittedapps.honeycombmatchthree;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.handknittedapps.honeycombmatchthree.HoneycombMatchThree;

public class Main_640x960 
{
	public static void main(String[] args) 
	{
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = HoneycombMatchThree.name;
		cfg.useGL20 = false;
		cfg.width = 640;
		cfg.height = 960;
		
		new LwjglApplication(new HoneycombMatchThree(), cfg);
	}
}

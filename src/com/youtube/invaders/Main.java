package com.youtube.invaders;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
// ============================================================================
//Texture atlas Management
import com.badlogic.gdx.tools.imagepacker.TexturePacker2;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2.Settings;
// ============================================================================
import com.youtube.invaders.MainGame;

public class Main {

	public static void main(String[] args) {
		// ==================================
		// Texture atlas Management
		// ==================================

		if (MainGame.rebuildAtlas) {
			Settings settings = new Settings();
			settings.maxWidth = 4096;
			settings.maxHeight = 4096;
			settings.debug = MainGame.drawDebugOutline; // Set on/off debug
														// texture lines
			// TexturePacker2.process(settings,"assets-raw/images",
			// "../SpaceInvaders-android/assets/images","spaceinvaders.pack");//
			
			// ORIGINAL
			TexturePacker2.process(settings,
					"../SpaceInvaders-android/assets-raw/images",
					"../SpaceInvaders-android/assets/images",
					"arcadia_alpha.pack");
		}

		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Arcadia";
		cfg.useGL20 = true;
		cfg.width = MainGame.WIDTH;
		cfg.height = MainGame.HEIGHT;

		new LwjglApplication(new MainGame(), cfg);
	}
}

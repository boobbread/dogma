package org.dogma;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

/**
 * This class is the main launcher, no edits really need to be made here
 */
public class DesktopLauncher {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

        // These two are decently self-explanatory
        config.setTitle("Dogma Desktop");
        config.setWindowedMode(1280, 720);

        new Lwjgl3Application(new DogmaMain(), config);
    }
}

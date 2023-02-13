package desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import core.CatFight;

public class Launcher {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration cfg = new Lwjgl3ApplicationConfiguration();
        cfg.setTitle(CatFight.APP_NAME);
        cfg.setWindowedMode(CatFight.SCREEN_WIDTH, CatFight.SCREEN_HEIGHT);
        cfg.setForegroundFPS(CatFight.FPS);

        new Lwjgl3Application(new CatFight(), cfg);
    }
}

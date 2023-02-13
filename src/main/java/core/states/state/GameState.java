package core.states.state;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import core.objects.GameObject;
import core.utils.graphics.screen.NoScreen;
import core.utils.graphics.screen.GameScreen;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class GameState implements ApplicationListener {
    protected HashMap<String, GameScreen> screens = new HashMap<>();
    protected GameScreen screen;
    protected ArrayList<GameObject> gameObjects = new ArrayList<>();
    private float StateTime = 0f;

    @Override
    public void pause () {
        if (screen != null) screen.pause();
    }

    @Override
    public void resume () {
        if (screen != null) screen.resume();
    }
    public void update(float delta){
        this.StateTime += delta;
    }

    public void render(SpriteBatch batch){
        if (screen != null) {
            screen.render(batch, gameObjects);
        }
    }

    @Override
    public void dispose () {
        if (screen != null) screen.hide();
    }

    @Override
    public void resize (int width, int height) {
        if (screen != null) screen.resize(width, height);
    }
    public void setScreen(String screen) {
        if (this.screen != null) this.screen.hide();
        this.screen = screens.get(screen);
        if (this.screen == null) {
            this.screen = new NoScreen();
        }
        this.screen.show();
        this.screen.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    public GameScreen getScreen () {
        return screen;
    }
}

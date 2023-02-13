package core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import core.states.state.GameState;
import core.states.StateManager;
import core.states.state.play.PlayState;

public class CatFight extends ApplicationAdapter {
    public static final int SCREEN_WIDTH = 960, SCREEN_HEIGHT = 640, FPS = 60;
    public static final String APP_NAME = "Cat Fight";
    public static float GameLifeCycle = 0f;
    private SpriteBatch batch;
    private StateManager<GameState> gameState;


    @Override
    public void create() {
        this.batch = new SpriteBatch();
        this.gameState = new StateManager<>();
        this.gameState.push(new PlayState());
    }

    public void update(){
        GameLifeCycle += Gdx.graphics.getDeltaTime();
        gameState.peek().update(Gdx.graphics.getDeltaTime());
    }

    @Override
    public void render() {
        this.update();
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);

        batch.begin();
        gameState.peek().render(batch);
        batch.end();
    }
}
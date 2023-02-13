package core.utils.graphics.screen;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import core.objects.GameObject;

import java.util.ArrayList;

public abstract class GameScreen extends ScreenAdapter {
    public void render(SpriteBatch batch, ArrayList<GameObject> objects){
        objects.stream().forEach(o -> o.render(batch));
    }
}

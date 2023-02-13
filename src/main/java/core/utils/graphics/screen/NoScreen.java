package core.utils.graphics.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import core.objects.GameObject;

import java.util.ArrayList;

public class NoScreen extends GameScreen {
    private BitmapFont font;

    @Override
    public void show() {
        super.show();
        this.font = new BitmapFont();
    }

    @Override
    public void render(SpriteBatch batch, ArrayList<GameObject> objects) {
        super.render(batch,objects);
        font.setColor(Color.PINK);
        font.draw(batch, "No screen", Gdx.graphics.getWidth() >> 1,Gdx.graphics.getHeight() >> 1);
    }
}

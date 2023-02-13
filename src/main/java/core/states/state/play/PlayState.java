package core.states.state.play;

import core.states.state.GameState;
import core.utils.graphics.screen.NoScreen;

public class PlayState extends GameState {

    public PlayState() {
        create();
    }

    @Override
    public void create() {
        this.screens.put("screen", new NoScreen());
        setScreen("screen");
    }

    @Override
    public void render() {}
}

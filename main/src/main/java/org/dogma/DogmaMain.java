package org.dogma;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import org.lwjgl.opengl.GL20;

/**
 * This is the main program for the game, the bit
 * that actually handle rendering stuff to the screen.
 */
public class DogmaMain extends ApplicationAdapter {

    Stage stage;
    TextButton button;
    TextButton.TextButtonStyle buttonStyle;
    BitmapFont font;
    Table table;

    @Override
    public void create() {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        font = new BitmapFont();

        buttonStyle = new TextButton.TextButtonStyle();
        buttonStyle.font = font;

        button = new TextButton("A Button", buttonStyle);
        button.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("Pressed");
            }
        });


        table = new Table();
        table.setFillParent(true);
        table.center();
        table.add(button);

        stage.addActor(table);
    }

    @Override
    public void render() {
        // Currently this just renders a black screen with nothing on it
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        super.render();
        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }

}

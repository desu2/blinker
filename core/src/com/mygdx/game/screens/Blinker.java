package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.mygdx.game.level.Level;

/**
 * Created by kl on 01.04.2016. :3
 */
public class Blinker implements Screen {
    TiledMap map = new TmxMapLoader().load("maps/map.tmx");
    OrthogonalTiledMapRenderer renderer= new OrthogonalTiledMapRenderer(map);;
    OrthographicCamera camera = new OrthographicCamera();


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        camera.update();
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        renderer.setView(camera);


        camera.position.x += 50*delta;
        camera.position.y += 50*delta;
        renderer.render();

    }


    @Override
    public void resize(int width, int height) {
        camera.viewportWidth = width;
        camera.viewportHeight = height;
        System.out.println("asd");
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }



}

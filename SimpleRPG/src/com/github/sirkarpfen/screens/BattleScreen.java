package com.github.sirkarpfen.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.github.sirkarpfen.main.EcharaGame;

public class BattleScreen extends BaseScreen {

	private EcharaGame game;

	public BattleScreen(EcharaGame game) {
		super(game);
		this.game = game;
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1f);
		Gdx.gl.glClear( GL10.GL_COLOR_BUFFER_BIT );
	}

	@Override
	public void resize(int width, int height) {}

	@Override
	public void show() {}

	@Override
	public void hide() {}

	@Override
	public void pause() {}

	@Override
	public void resume() {}

	@Override
	public void dispose() {}

}

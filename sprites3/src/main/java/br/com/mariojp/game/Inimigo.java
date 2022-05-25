package br.com.mariojp.game;

public class Inimigo extends Sprite {

	private int initX;
	
	public Inimigo(int x, int y) {
		super(x, y);
		this.initX = x;
		initComponent("/imagens/alien.png");
	}

	public void move() {
		if (x < 0) {
			x = initX;
		}
		x -= 1;
	}

}

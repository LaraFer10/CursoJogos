package br.com.mariojp.game;

public class Missil extends Sprite{

	
	private final int MISSILE_SPEED = 2;
	private int alcance;
	
	public Missil(int x, int y,int alcance) {
		super(x, y);
		this.alcance = alcance;
		initComponent("/imagens/missil.png");
	}
	
	public void move() {
		x += MISSILE_SPEED;
		if (x > this.alcance) {
			visibilty = false; 
		}
	}
}

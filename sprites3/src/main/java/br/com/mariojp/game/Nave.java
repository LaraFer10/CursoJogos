package br.com.mariojp.game;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Nave extends Sprite {
	private int dx;
	private int dy;

	private int alcance;
	
    private ArrayList<Missil> missiles;

	public Nave(int x, int y, int alcance) {
		super(x, y);
		this.alcance = alcance;
		missiles = new ArrayList<Missil>();
		initComponent("/imagens/nave.png");
	}

	public void move() {
		x += dx;
		y += dy;
	}


	public Image getImage() {
		return image;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_SPACE) {
			atira(); 
		}
		if (key == KeyEvent.VK_LEFT || key==KeyEvent.VK_UP){
			dx= -1;
		}if(key==KeyEvent.VK_RIGHT || key==KeyEvent.VK_DOWN){
			dx = 1;
		}
	}
	
	private void atira() {
		missiles.add(new Missil(x + width, y + height / 2, alcance ));		
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT || key==KeyEvent.VK_RIGHT || key==KeyEvent.VK_UP || key==KeyEvent.VK_DOWN){
			dx =0;
		}
	}

	public ArrayList<Missil> getMissiles() {
		return missiles;
	}
}

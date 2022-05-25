package br.com.mariojp.game;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public abstract class Sprite {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected boolean visibilty;
	protected String imgComponent;

	protected Image image;

	public Sprite(int x, int y) {
		this.x = x;
		this.y = y;
		visibilty = true;
		initComponent();
	}

	protected void carregarImagem(String imageName) {
		ImageIcon ii = new ImageIcon(this.getClass().getResource(imageName));
		image = ii.getImage();
	}

	protected void getImageDimensions() {
		width = image.getWidth(null);
		height = image.getHeight(null);
	}

	public Image getImage() {
		return image;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isVisible() {
		return visibilty;
	}

	public void setVisible(Boolean visible) {
		this.visibilty = visible;
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
	
	public void initComponent(){
		carregarImagem(imgComponent);
		getImageDimensions();
	}
}

package br.com.mariojp.game;

public class Inimigo extends Sprite {

	private int initX;
	
	public Inimigo(int x, int y) {
		super(x, y);
		this.initX = x;
		imgComponent = "/imagens/alien.png";
	}

	//TODO ADICIONAR UM FACTORY DE INICIALIZAÇÃO (?)
	/*private void initInimigo() {
		carregarImagem("/imagens/alien.png");
		getImageDimensions();
	}*/

	public void move() {
		if (x < 0) {
			x = initX;
		}
		x -= 1;
	}

}
